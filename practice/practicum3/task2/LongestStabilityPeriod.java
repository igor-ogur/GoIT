package practice.practicum3.task2;

import java.util.ArrayList;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        if (gdp.length == 0) return 0;
        if (gdp.length == 1) return 1;

        int comparing;
        int countMonths = 1;
        ArrayList<Integer> periods = new ArrayList<>();

        for (int i = 0; i < gdp.length-1; i++) {
            comparing = gdp[i];
            for (int j = i+1; j < gdp.length; j++) {
                int temp = gdp[j] - comparing;
                if (temp == 1 || temp == 0) countMonths++;
                else break;
            }
            periods.add(countMonths);
            countMonths = 1;
        }

        countMonths = 1;

        for (int i = 0; i < gdp.length-1; i++) {
            comparing = gdp[i];
            for (int j = i+1; j < gdp.length; j++) {
                int temp = gdp[j] - comparing;
                if (temp == -1 || temp == 0) countMonths++;
                else break;
            }
            periods.add(countMonths);
            countMonths = 1;
        }


        int result = periods.get(0);
        for (Integer period : periods) {
            if (period > result) result = period;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903};
        System.out.println(new LongestStabilityPeriod().count(a));
    }
}
