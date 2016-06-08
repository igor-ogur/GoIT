package practice.practicum3.task4;


public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        int N = x.length;
        int maxX = x[0];
        for (int i = 0; i < N; i++) {
            if (x[i] > maxX) maxX = x[i];
        }
        int maxH = h[0];
        for (int i = 0; i < N; i++) {
            if (h[i] > maxH) maxH = h[i];
        }
        int maxW = w[0];
        for (int i = 0; i < N; i++) {
            if (w[i] > maxW) maxW = w[i];
        }
        maxW += maxX;
        int[][] general = new int[maxH][maxW];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < h[i]; j++) {
                for (int k = x[i]; k < w[i]+x[i]; k++) {
                    general[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < general.length; i++) {
            for (int j = 0; j < general[0].length; j++) {
                if (general[i][j] == 1) sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] x = {0, 1};
        int[] h = {1, 1};
        int[] w = {1, 1};
        System.out.println(new RectangleSquare().measure(x, h, w));
    }
}
