package practicum2.task5;

public class CountBits {
    public int count(int num) {
        String s = Integer.toBinaryString(num);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountBits().count(-2147483647));
    }
}
