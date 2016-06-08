package practice.practicum3.task6;

public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {

        int N = gnames.length;
        int[] result = new int[N];
        boolean b = true;
        for (int i = 0; i < N-1; i++) {
            if (gnames[i] != gnames[i+1]) b = false;
        }
        if (b) {
            for (int i = 0; i < N; i++) {
                result[i] = N-i-1;
            }
            return result;
        }

        int maxG = Integer.MIN_VALUE;
        int maxP = Integer.MIN_VALUE;
        int indexMaxG = 0;
        int indexMaxP = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (gnames[j] > maxG) {
                    maxG = gnames[j];
                    indexMaxG = j;
                }
            }
            gnames[indexMaxG] = Integer.MIN_VALUE;
            maxG = gnames[0];
            for (int j = 0; j < N; j++) {
                if (portions[j] > maxP) {
                    maxP = portions[j];
                    indexMaxP = j;
                }
            }
            portions[indexMaxP] = Integer.MIN_VALUE;
            maxP = portions[0];
            result[indexMaxP] = indexMaxG;
        }
        return result;
    }    
}
