package practicum3.task1;

public class UnixPath {
    public String simplify(String input) {
        /*String[] parts = input.split("/");
        StringBuilder result = new StringBuilder();
        for (int i = parts.length-3; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                result.append("/");
                result.append(parts[i]);
            }
        }
        return result.toString();*/
        StringBuilder sb = new StringBuilder(input);
        sb.deleteCharAt(sb.lastIndexOf("/"));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new UnixPath().simplify("/home/../var/./lib//file.txt"));
    }
}
