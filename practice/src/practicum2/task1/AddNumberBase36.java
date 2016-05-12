package practice.src.practicum2.task1;

public class AddNumberBase36 {
    public String add(String a, String b) {
        
        /*BigInteger aInt = new BigInteger(a, 36);
        BigInteger bInt = new BigInteger(b, 36);
        aInt = aInt.add(bInt);
        return aInt.toString(36);*/

        String numbers = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        a = new StringBuilder(a).reverse().toString().toLowerCase();
        b = new StringBuilder(b).reverse().toString().toLowerCase();
        int maxLength;
        String maxLengthNumber;
        if (a.length() >= b.length()){
            maxLength = a.length();
            maxLengthNumber = a;
        }else {
            maxLength = b.length();
            maxLengthNumber = b;
        }
        int term = 0;
        for (int i = 0; i < maxLength; i++) {
            try {
                int index = numbers.indexOf(a.charAt(i)) + numbers.indexOf(b.charAt(i));
                if (index + term < 36) {
                    result.append(numbers.charAt(index + term));
                    term = 0;
                } else {
                    result.append(numbers.charAt(index + term - 36));
                    term = 1;
                }
            }catch (IndexOutOfBoundsException e){
                for (int j = i; j < maxLength; j++) {
                            int index = numbers.indexOf(maxLengthNumber.charAt(j));
                            if (index + term < 36) {
                                result.append(numbers.charAt(index + term));
                                term = 0;
                            } else {
                                result.append(numbers.charAt(index + term - 36));
                                term = 1;
                            }
                }
                break;
            }
        }
        if (term == 1) result.append(1);
        return result.reverse().toString();
    }
}
