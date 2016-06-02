package core.homework9;

import java.util.ArrayList;
import java.util.List;

public class CesarCipher {
    List<Character> alphabet = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-', ' '};
    public CesarCipher() {
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
        for (char c : PUNCTUATION) {
            alphabet.add(c);
        }
    }

    public String encrypt (String textToEncrypt, int offset){
        int cardinality = alphabet.size();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textToEncrypt.length(); i++) {
            char c = textToEncrypt.charAt(i);
            if (alphabet.indexOf(c) != -1) result.append(alphabet.get((alphabet.indexOf(c) + offset) % cardinality));
            else result.append(c);
        }
        return result.toString();
    }

    public String decrypt (String textToDecrypt, int offset){
        int cardinality = alphabet.size();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textToDecrypt.length(); i++) {
            char c = textToDecrypt.charAt(i);
            if (alphabet.indexOf(c) != -1) result.append(alphabet.get((alphabet.indexOf(c) - offset + cardinality) % cardinality));
            else result.append(c);
        }
        return result.toString();
    }
}
