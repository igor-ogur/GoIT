package practice.practicum2.task7;

public class AddBinary {
    String add(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int maxLength;
        String maxNumber;
        if (a.length() > b.length()){
            maxLength = a.length();
            maxNumber = a;
        }else{
            maxLength = b.length();
            maxNumber = b;
        }
        int term = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length() && i < b.length()) {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    result.append(term);
                    term = 1;
                }else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    result.append(term);
                    term = 0;
                }else {
                    if (term == 0) {
                        result.append(1);
                        term = 0;
                    }else {
                        result.append(0);
                        term = 1;
                    }
                }


            }else {
                if (maxNumber.charAt(i) == '1' && term == 1){
                    result.append(0);
                }else if (maxNumber.charAt(i) == '0' && term == 0){
                    result.append(0);
                }else {
                    result.append(1);
                    term = 0;
                }
            }
        }
        if (term == 1) result.append(1);
        return result.reverse().toString();
    }
}
