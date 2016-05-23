package practicum4.task2;

public class WordNumber {
    /*public int count(String input) {
        input = input.replaceAll("\\p{Punct}", " ");
        input = input.replaceAll("\n", " ");

        String[] words = input.split(" ");
        int result = 0;
        for (String x : words){
           if (isWorld(x.toCharArray())) result++;
        }
        return result;
    }
    public boolean isWorld(char[] chars){
        boolean result = false;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) result = true;
            else {
                result = false;
                break;
            }
        }
        return result;
    }*/

    public int count(String input) {
        char[] chars = input.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length-1) {
                if (((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) &&
                (!((chars[i+1] >= 65 && chars[i+1] <= 90) || (chars[i+1] >= 97 && chars[i+1] <= 122)))) result++;
            }else if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new WordNumber().count("how AreYou?"));
    }
}
