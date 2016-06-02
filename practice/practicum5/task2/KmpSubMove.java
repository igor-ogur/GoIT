package practice.practicum5.task2;

public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
        int result = -1;
        StringBuilder intermediate = new StringBuilder(inputStr);
        for (int i = 0; i < inputStr.length(); i++) {
            if (intermediate.toString().equals(resultStr)) result = i;
            char lastChar = intermediate.charAt(intermediate.length()-1);
            intermediate.deleteCharAt(intermediate.length()-1);
            intermediate.insert(0, lastChar);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new KmpSubMove().subMoveQuantity("abcd", "cdab"));
    }
}
