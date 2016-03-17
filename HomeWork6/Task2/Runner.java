package HomeWork6.Task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Runner {

    private static String countDifferentKindsOfMusicalInstrument(List<MusicalInstrument> instruments){
        int pianos = 0;
        int guitars = 0;
        int trumpets = 0;
        for (MusicalInstrument x : instruments){
            if (x instanceof Piano) pianos++;
            if (x instanceof Guitar) guitars++;
            if (x instanceof Trumpet) trumpets++;
        }
        return String.format("Pianos - %d, Guitars - %d, Trumpets - %d", pianos, guitars, trumpets);
    }
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        List<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();
        instruments.add(new Piano());
        instruments.add(new Piano());
        for (int i = 0; i < 16; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 7; i++) {
            instruments.add(new Trumpet());
        }
        musicStore.setMusicalInstruments(instruments);
        System.out.println(countDifferentKindsOfMusicalInstrument(musicStore.getMusicalInstruments()));

        Map<String, Integer> order1 = new TreeMap<String, Integer>();
        order1.put("guitar", 7);
        order1.put("trumpet", 2);

        musicStore.setMusicalInstruments(musicStore.prepareInstruments(order1));
        System.out.println(countDifferentKindsOfMusicalInstrument(musicStore.getMusicalInstruments()));

        Map<String, Integer> order2 = new TreeMap<String, Integer>();
        order2.put("guitar", 6);
        order2.put("piano", 1);

        musicStore.prepareInstruments(order2);
        System.out.println(countDifferentKindsOfMusicalInstrument(musicStore.getMusicalInstruments()));

        /*Map<String, Integer> order3 = new TreeMap<String, Integer>();
        order3.put("guitar", 7);
        order3.put("pianos", 4);

        musicStore.prepareInstruments(order3);
        System.out.println(countDifferentKindsOfMusicalInstrument(musicStore.getMusicalInstruments()));*/

    }
}
