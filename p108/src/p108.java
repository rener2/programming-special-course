import java.util.Scanner;

/**
 * @author rerakk
 *         ansalt
 */
public class p108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int N = input.nextInt();
            int[][] array = new int[N+1][N+1];
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < N; j++) {
                        array[i][j] = input.nextInt() + array[i-1][j];
                    }
            }
            System.out.println(maxSum(array, N));
            }

        }
    public static int maxSum(int[][] array, int N) {
        int maximumSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++, sum = 0) {
                for (int k = 0; k < N; k++) {
                    if (sum >= 0) {
                        sum += array[j + i][k] - array[j][k];
                    } else {
                        sum = array[j + i][k] - array[j][k];
                    }
                    if (sum > maximumSum) {
                        maximumSum = sum;
                    }

                }
            }
        }
        return maximumSum;
    }
}




