package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SKLAD-PC on 29.03.16.
 */
public class Runner {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new Image("Sunset", "jpg", 5.5));
        files.add(new Image("Ocean", "jpg", 7.4));
        files.add(new AudioFile("Rolling in the deep", "m4a", 6.3));
        files.add(new AudioFile("Lean on", "mp3", 8.5));
        files.add(new TextFile("HomeWork", "doc", 0.4));
        files.add(new TextFile("Thinking in Java", "pdf", 6.2));

        CollectionPrinter.printCollection(files);
        System.out.println();

        Set<File> fileSet = new TreeSet<>(files);

        CollectionPrinter.printCollection(fileSet);

    }
}
