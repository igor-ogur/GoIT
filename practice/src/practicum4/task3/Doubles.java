package practicum4.task3;

public class Doubles {
    public Double parse(String s) {
        Double d = null;
        try {
            d = Double.parseDouble(s);
        }catch (NumberFormatException e){
        }
        return d;
    }

    public static void main(String[] args) {
        new Doubles().parse("-.");
    }
}
