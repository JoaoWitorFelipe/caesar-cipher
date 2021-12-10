;

public class Main {

    public static void main(String[] args) {

        CaesarCipherEncryptor encryptor = new CaesarCipherEncryptor();
        CaesarCipherDecipher decipher = new CaesarCipherDecipher();

        String wordProcessed = "a ligeira raposa marrom saltou sobre o cachorro cansado";
        String encryptedWord = encryptor.processWord(wordProcessed);
        System.out.println("WORD TO BE PROCESSED: " +  wordProcessed);
        System.out.println("ENCRYPTED WORD: " + encryptedWord);
        String decryptedWord = decipher.processWord(encryptedWord);
        System.out.println("DECRYPTED WORD: " + decryptedWord);
    }

}

