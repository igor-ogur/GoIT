package practice.practicum1.task5;

public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int j = 0;
        int[] result = new int[input.length * input[0].length];
        int index = 0;
        while (index != result.length){
            for (int i = 0; i < input[0].length; i++) {
                if (j == 0) {
                    while (j < input.length) {
                        result[index] = input[j][i];
                        j++;
                        index++;
                    }
                    continue;
                }
                if (j == input.length) {
                    while (j > 0) {
                        result[index] = input[j-1][i];
                        j--;
                        index++;
                    }
                    continue;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] in = {{ 1, 2, 3, 4 },
                      { 4, 5, 6, 7 },
                      { 7, 8, 9, 0}};
        int[] result = new MatrixSnakeTraversal().print(in);
        for (int x : result) {
            System.out.print(x+" ");
        }
    }
}
