package practicum2.task1;

import java.math.BigInteger;
import java.util.ArrayList;

public class AddNumberBase36 {
    public String add(String a, String b) {
        ArrayList<Character> numbers = new ArrayList<>();
        for (int i = 0; i <=9 ; i++) {
            numbers.add((char) (i + 48));
        }
        for (int i = 10; i < 36 ; i++) {
            numbers.add((char) (i + 87));
        }
        char[] numberA = new StringBuilder(a).reverse().toString().toCharArray();
        BigInteger sum = new BigInteger("0");
        System.out.println(sum.toString());
        /*for (int i = 0; i < numberA.length; i++) {
            sum += numbers.indexOf(numberA[i]) * Math.pow(36, i) ;
        }
        char[] numberB = new StringBuilder(b).reverse().toString().toCharArray();
        for (int i = 0; i < numberB.length; i++) {
            sum += numbers.indexOf(numberB[i]) * Math.pow(36, i) ;
        }
        System.out.println(sum);
        StringBuilder result = new StringBuilder();
        while (sum > 0){
            result.append(numbers.get(sum % 36));
            sum /= 36;
        }
        if (result.length() == 0) return "0";
        return result.reverse().toString();*/
        return "0";
    }

    public static void main(String[] args) {
        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add("dfsgdgdgdfgdfgdfgdsfsgdfsg", "sfdgfgfgsfg"));
    }
}
