package practice.practicum5.task1;

public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        String possibleResult = null;
        for (int i = 1; i < input.length(); i++) {
            possibleResult = input.substring(0, i);
            if (possibleResult.equals(input.substring(i, i + i))) break;
        }
        if (input.replaceAll(possibleResult, "").length() == 0) return possibleResult;
        else return null;
    }

    public static void main(String[] args) {
        System.out.println(new KmpSmallestPeriod().findSmalletstPeriod("abcabcabcabc"));
    }
}
