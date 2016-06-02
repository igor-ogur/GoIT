package core.homework8;

import java.util.Collection;


public class CollectionPrinter {
    public static void printCollection (Collection collection){
        String s = String.format("%-30s%-10s%-10s", "File name", "Type", "Size, MB");
        System.out.println(s);
        System.out.println("--------------------------------------------------");
        collection.stream().forEach(System.out::println);
    }
}
