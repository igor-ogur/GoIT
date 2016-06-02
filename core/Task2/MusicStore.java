package core.Task2;

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
        List<MusicalInstrument> orderList = new ArrayList<MusicalInstrument>();
        for (Map.Entry<String, Integer> x : order.entrySet()){
            if (x.getValue() <= 0) throw new IllegalArgumentException("Number of musical instrument in order must be > 0");
            int countRemoves = 0;
            String s = x.getKey();
            if (s.equals("piano")) {
                for (MusicalInstrument y : musicalInstruments){
                    if (y instanceof Piano) {
                        orderList.add(y);
                        if (++countRemoves == x.getValue()) break;
                    }
                }
                if (countRemoves < x.getValue()) {
                    throw new IllegalArgumentException("Number pianos in order is more then music store has. Order has been canceled");
                }

            }else if (s.equals("guitar")) {
                for (MusicalInstrument y : musicalInstruments){
                    if (y instanceof Guitar) {
                        orderList.add(y);
                        if (++countRemoves == x.getValue()) break;
                    }
                }
                if (countRemoves < x.getValue()) {
                    throw new IllegalArgumentException("Number guitars in order is more then music store has. Order has been canceled");
                }

            } else if (s.equals("trumpet")) {
                for (MusicalInstrument y : musicalInstruments){
                    if (y instanceof Trumpet) {
                        orderList.add(y);
                        if (++countRemoves == x.getValue()) break;
                    }
                }
                if (countRemoves < x.getValue()) {
                    throw new IllegalArgumentException("Number trumpets in order is more then music store has. Order has been canceled");
                }

            } else {
                throw new UnknownKeyException();
            }
        }
        musicalInstruments.removeAll(orderList);
        return musicalInstruments;
    }

}
