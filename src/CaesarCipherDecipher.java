public class CaesarCipherDecipher extends CaesarCipher {

    @Override
    public int getIndex(int indexOfLetter) {
        int newIndex = indexOfLetter - ROTATION;
        int listSize = this.alphabet.size();

        if (newIndex < 0) {
            return listSize - (newIndex * (-1));
        }

        return newIndex;
    }
}
