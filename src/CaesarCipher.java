import java.util.ArrayList;
import java.util.Locale;

public abstract class CaesarCipher {
    public abstract int getIndex(int indexOfLetter);

    final static int ROTATION = 3;
    ArrayList<String> alphabet;

    CaesarCipher() {
        init();
    }

    public String processWord(String word) {

        word = word.toLowerCase(Locale.ROOT);
        String encryptedWord = "";

        for(char letter: word.toCharArray()) {
            String stringFromChar = String.valueOf(letter);
            String newLetter = "";
            if (stringFromChar.isBlank()) {
                newLetter = " ";
            } else {
                newLetter = this.handle(stringFromChar);
            }

            encryptedWord = encryptedWord.concat(newLetter);
        }

        return encryptedWord;
    }

    private String handle(String stringFromChar) {
        int indexOfLetter = this.alphabet.indexOf(stringFromChar);
        int indexToGetEncryptedLetter = this.getIndex(indexOfLetter);
        return this.alphabet.get(indexToGetEncryptedLetter);
    }


    private void init() {
        this.alphabet = new ArrayList<>();
        this.alphabet.add("a");
        this.alphabet.add("b");
        this.alphabet.add("c");
        this.alphabet.add("d");
        this.alphabet.add("e");
        this.alphabet.add("f");
        this.alphabet.add("g");
        this.alphabet.add("h");
        this.alphabet.add("i");
        this.alphabet.add("j");
        this.alphabet.add("k");
        this.alphabet.add("l");
        this.alphabet.add("m");
        this.alphabet.add("n");
        this.alphabet.add("o");
        this.alphabet.add("p");
        this.alphabet.add("q");
        this.alphabet.add("r");
        this.alphabet.add("s");
        this.alphabet.add("t");
        this.alphabet.add("u");
        this.alphabet.add("v");
        this.alphabet.add("w");
        this.alphabet.add("x");
        this.alphabet.add("y");
        this.alphabet.add("z");
    }


}
