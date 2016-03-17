package HomeWork6.Task2;

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
        int countRemoves = 0;
        for (int i = 0; i < musicalInstruments.size(); i++) {
                if (musicalInstruments.get(i) instanceof Piano) {
                    musicalInstruments.remove(i);
                    if (++countRemoves == numberPianos) return;
                }
        }
        if (countRemoves != numberPianos) throw new IllegalArgumentException("Number pianos in order is more then music store has");
    }

    private void removeGuitarsFromMusicalInstrumentsList(int numberGuitars) {
        int countRemoves = 0;
        for (int i = 0; i < musicalInstruments.size(); i++) {
                if (musicalInstruments.get(i) instanceof Guitar) {
                    musicalInstruments.remove(i);
                    if (++countRemoves == numberGuitars) return;
                }
        }
        if (countRemoves != numberGuitars) throw new IllegalArgumentException("Number guitars in order is more then music store has");
    }

    private void removeTrumpetsFromMusicalInstrumentsList(int numberTrumpets) {
        int countRemoves = 0;
        for (int i = 0; i < musicalInstruments.size(); i++) {
                if (musicalInstruments.get(i) instanceof Trumpet) {
                    musicalInstruments.remove(i);
                    if (++countRemoves == numberTrumpets) return;
                }
        }
        if (countRemoves != numberTrumpets) throw new IllegalArgumentException("Number trumpets in order is more then music store has");
    }

}
