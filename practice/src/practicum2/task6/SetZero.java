package practicum2.task6;

public class SetZero {
    public int set(int num, int i) {
        String binaryNumber = Integer.toBinaryString(num);
        char[] bits = binaryNumber.toCharArray();
        if (i <= bits.length) bits[bits.length - i] = '0';
        binaryNumber = String.valueOf(bits);
        return Integer.parseUnsignedInt(binaryNumber, 2);
    }

    public static void main(String[] args) {
        System.out.println(new SetZero().set(-1, 31));
    }
}
