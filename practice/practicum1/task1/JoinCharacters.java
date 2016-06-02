package practice.practicum1.task1;

public class JoinCharacters {
    public int join(char[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        char[] c = {'1', '2'};
        System.out.println(new JoinCharacters().join(c));
    }
}
