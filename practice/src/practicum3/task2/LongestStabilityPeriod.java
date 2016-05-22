package practicum3.task2;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int comparing = gdp[0];
        int countMonths = 1;
        int secondCount = 1;
        int maxPeriod = 1;
        boolean b = false;
        for (int i = 1; i < gdp.length; i++) {
            if (Math.abs(gdp[i] - comparing) == 0) {
                countMonths++;
                if (countMonths > maxPeriod) maxPeriod = countMonths;
            }
            if (Math.abs(gdp[i] - comparing) == 1) {
                countMonths++;
                if (countMonths > maxPeriod) maxPeriod = countMonths;
                b = true;
                secondCount++;
                if (secondCount > maxPeriod) maxPeriod = secondCount;

            }else {
                countMonths = 1;
                comparing = gdp[i];
            }
        }
        return maxPeriod;
    }

    public static void main(String[] args) {
        int[] a = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901};
        System.out.println(new LongestStabilityPeriod().count(a));
    }
}
