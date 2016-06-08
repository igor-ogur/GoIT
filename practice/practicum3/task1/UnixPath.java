package practice.practicum3.task1;

public class UnixPath {
    public String simplify(String input) {
        String[] elements = input.split("/");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(".")) elements[i] = "";
            if (elements[i].equals("..")) {
                elements[i] = "";
                if (i > 0) {
                    int j = i-1;
                    while (j >= 0) {
                        if (!elements[j].equals("")) {
                            elements[j] = "";
                            break;
                        }
                        j--;
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (String s : elements){
            if (!s.equals("")) {
                result.append("/");
                result.append(s);
            }
        }
        if (result.length() == 0) return "/";
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new UnixPath().simplify("/home/../var/.///../lib//file.txt"));
    }
}
