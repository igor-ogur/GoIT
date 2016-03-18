package HomeWork6.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MusicStore {
    private List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order){
        for (Map.Entry<String, Integer> x : order.entrySet()){
            String s = x.getKey();
            if (s.equals("piano")) {
                removePianosFromMusicalInstrumentsList(x.getValue());

            } else if (s.equals("guitar")) {
                removeGuitarsFromMusicalInstrumentsList(x.getValue());

            } else if (s.equals("trumpet")) {
                removeTrumpetsFromMusicalInstrumentsList(x.getValue());

            } else {
                throw new UnknownKeyException();
            }
        }
        return musicalInstruments;
    }

    private void removePianosFromMusicalInstrumentsList(int numberPianos) {
        List<MusicalInstrument> temp = new ArrayList<MusicalInstrument>(musicalInstruments);
        int countRemoves = 0;
        for (MusicalInstrument x : temp){
            if (x instanceof Piano){
                musicalInstruments.remove(x);
                if (++countRemoves == numberPianos) break;
            }
        }
        if (countRemoves < numberPianos) throw new IllegalStateException("Number pianos in order is more then music store has. Order has been canceled");
        musicalInstruments.retainAll(temp);
    }

    private void removeGuitarsFromMusicalInstrumentsList(int numberGuitars) {
        List<MusicalInstrument> temp = new ArrayList<MusicalInstrument>(musicalInstruments);
        int countRemoves = 0;
        for (MusicalInstrument x : temp){
            if (x instanceof Guitar){
                musicalInstruments.remove(x);
                if (++countRemoves == numberGuitars) break;
            }
        }
        if (countRemoves < numberGuitars) throw new IllegalStateException("Number guitars in order is more then music store has. Order has been canceled");
        musicalInstruments.retainAll(temp);
    }

    private void removeTrumpetsFromMusicalInstrumentsList(int numberTrumpets) {
        List<MusicalInstrument> temp = new ArrayList<MusicalInstrument>(musicalInstruments);
        int countRemoves = 0;
        for (MusicalInstrument x : temp){
            if (x instanceof Trumpet){
                musicalInstruments.remove(x);
                if (++countRemoves == numberTrumpets) break;
            }
        }
        if (countRemoves < numberTrumpets) throw new IllegalStateException("Number trumpets in order is more then music store has. Order has been canceled");
        musicalInstruments.retainAll(temp);
    }

}
