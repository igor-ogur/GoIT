package homework8;

import java.util.Collection;


public class CollectionPrinter {
    public static void printCollection (Collection collection){
        collection.stream().forEach(e -> System.out.println(e));
    }
}
