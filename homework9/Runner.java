package homework9;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new Image("Sunset", "jpg", 5.5));
        files.add(new Image("Ocean", "jpg", 7.4));
        files.add(new AudioFile("Rolling in the deep", "m4a", 6.3));
        files.add(new AudioFile("Lean on", "mp3", 8.5));
        files.add(new TextFile("HomeWork", "doc", 0.4));
        files.add(new TextFile("Thinking in Java", "pdf", 6.2));

        System.out.println("Files collection:\n");
        files.stream().forEach(e -> System.out.println(e.toString()));
        System.out.println();

        CesarCipher cesarCipher = new CesarCipher();
        List<String> encryptedFiles = new ArrayList<>();
        System.out.println("Encrypted files collection:\n");
        files.stream().forEach(e -> {
            encryptedFiles.add(cesarCipher.encrypt(e.toString(), 3));
            System.out.println(cesarCipher.encrypt(e.toString(), 3));
        });
        System.out.println();

        System.out.println("Decrypted files collection:\n");
        encryptedFiles.stream().forEach(e -> System.out.println(cesarCipher.decrypt(e.toString(), 3)));

    }
}
