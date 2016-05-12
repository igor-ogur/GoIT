package practicum2.task4;

public class AbcNumber {
    public int convert(String num) {
        String numbers = "abcdefghij";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            sb.append(numbers.indexOf(num.charAt(i)));
        }
        return Integer.parseInt(sb.toString());
    }
}
