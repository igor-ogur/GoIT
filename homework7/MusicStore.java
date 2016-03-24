package homework7;

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
            if (!x.getKey().equals("piano") && !x.getKey().equals("trumpet") && !x.getKey().equals("guitar")) throw new UnknownKeyException();
            if (x.getValue() <= 0) throw new IllegalArgumentException("Number of musical instrument in order must be > 0");
            orderList.addAll(fillOrderListWithInstrument(x.getKey(), x.getValue()));
        }
        musicalInstruments.removeAll(orderList);
        return musicalInstruments;
    }

    private List<MusicalInstrument> fillOrderListWithInstrument(String instrumentName, Integer instrumentNumber){
        List<MusicalInstrument> result = new ArrayList<MusicalInstrument>();
        int countRemoves = 0;
        for (MusicalInstrument y : musicalInstruments){
            if (y.getType().equals(instrumentName)) {
                result.add(y);
                if (++countRemoves == instrumentNumber) break;
            }
        }
        if (countRemoves < instrumentNumber) {
            throw new IllegalArgumentException("Number "+instrumentName+"s in order is more then music store has. Order has been canceled");
        }
        return result;
    }

    /* I found anti-pattern "copy-paste" in my code:

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

    So I did refactor of my code and transferred all logic from these "if" to method:

    private List<MusicalInstrument> fillOrderListWithInstrument(String instrumentName, Integer instrumentNumber){
        List<MusicalInstrument> result = new ArrayList<MusicalInstrument>();
        int countRemoves = 0;
        for (MusicalInstrument y : musicalInstruments){
            if (y.getType().equals(instrumentName)) {
                result.add(y);
                if (++countRemoves == instrumentNumber) break;
            }
        }
        if (countRemoves < instrumentNumber) {
            throw new IllegalArgumentException("Number "+instrumentName+"s in order is more then music store has. Order has been canceled");
        }
        return result;
    }
    */

}
