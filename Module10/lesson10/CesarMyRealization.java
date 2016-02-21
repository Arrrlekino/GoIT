package ua.alla.lesson10;

/**
 * Created by Arlekino on 2/21/2016.
 */
public class CesarMyRealization {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String codedAlphabet = "cdefghijklmnopqrstuvwxyzab CDEFGHIJKLMNOPQRSTUVWXYZAB";

    public String encrypt(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            encodedText.append(codedAlphabet.charAt(index));
        }
        return encodedText.toString();
    }
    public String decrypt(String text){
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = codedAlphabet.indexOf(c);
            decodedText.append(alphabet.charAt(index));
        }
        return decodedText.toString();
    }
}
