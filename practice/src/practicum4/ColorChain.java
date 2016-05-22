package practicum4;

public class ColorChain {
    public int count(int N) {
        int[] intermediateResults = new int[N+1];
        return countDP(N, intermediateResults);
    }

    private int countDP(int N, int[] intermediateResults) {
        if (N < 0) return 0;
        if (N == 0) return 1;
        if (N < 3) return N;
        if (intermediateResults[N] != 0) return intermediateResults[N];

        int numberOfRed = countDP(N - 3, intermediateResults);
        int numberOfYellow = countDP(N - 2, intermediateResults);
        int numberOfWhite = countDP(N - 1, intermediateResults);

        int result = numberOfRed + numberOfWhite + numberOfYellow;
        intermediateResults[N] = result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ColorChain().count(35));
    }


}
