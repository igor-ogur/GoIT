package practice.practicum4.task1;

public class ColorChain {
    /*int countChange(int amount) {
        return cc(amount, 3);
    }
    int cc(int amount, int kindsOfCoins) {
        if (amount == 0) return 1;
        if (amount < 0 || kindsOfCoins==0) return 0;
        else return cc(amount, kindsOfCoins - 1) + cc(amount - firstDenomination(kindsOfCoins), kindsOfCoins);
    }

    int firstDenomination(int kindsOfCoins) {
        if (kindsOfCoins == 1) return 1;
        else if (kindsOfCoins==2) return 2;
        else return 3;
        //else if (kindsOfCoins==4) return 25;
        //else return 50;
    }*/

    private int count(int N) {
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
