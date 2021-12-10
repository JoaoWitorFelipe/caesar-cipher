public class CaesarCipherEncryptor extends CaesarCipher {

    @Override
    public int getIndex(int indexOfLetter) {
        int newIndex = indexOfLetter + ROTATION;
        int listSize = this.alphabet.size();

        if (newIndex >= listSize) {
             return newIndex - listSize;
        }

        return newIndex;
    }
}
