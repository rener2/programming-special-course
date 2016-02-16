/**
 * @author: <rerakk>
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int[] numbers = new int [9];
            for (int i = 0; i < 9; i++) {
                int number = input.nextInt(); numbers[i] = number;
            }
            solution(numbers);
        }
    }


    public static void solution(int[] numbers) {
        int[] brownSum = {numbers[3] + numbers[6], numbers[0] + numbers[6], numbers[0] + numbers[3]};
        int[] greenSum = {numbers[4] + numbers[7], numbers[1] + numbers[7], numbers[1] + numbers[4]};
        int[] clearSum = {numbers[5] + numbers[8], numbers[2] + numbers[8], numbers[2] + numbers[5]};
        String firstL = "";
        String secondL = "";
        String thirdL = "";
        String bottleOrder = "GGG";
        int movements = 1000000000;
        for (int i = 0; i < brownSum.length; i++) {
            for (int j = 0; j < greenSum.length; j++) {
                for (int k = 0; k < clearSum.length; k++) {
                    if (!(k == j || i == k || i == j)) {
                        if (i == 0) {
                            firstL = "B";
                        }
                        if (i == 1) {
                            secondL = "B";
                        }
                        if (i == 2) {
                            thirdL = "B";
                        }
                        if (j == 0) {
                            firstL = "G";
                        }
                        if (j == 1) {
                            secondL = "G";
                        }
                        if (j == 2) {
                            thirdL = "G";
                        }
                        if (k == 0) {
                            firstL = "C";
                        }
                        if (k == 1) {
                            secondL = "C";
                        }
                        if (k == 2) {
                            thirdL = "C";
                        }
                        String newOrder = firstL + secondL + thirdL;
                        if ((brownSum[i] + greenSum[j] + clearSum[k] == movements && newOrder.compareTo(bottleOrder) < 0) || brownSum[i] + greenSum[j] + clearSum[k] < movements) {
                            movements = brownSum[i] + greenSum[j] + clearSum[k];
                            bottleOrder = firstL + secondL + thirdL;
                        }
                    }
                }
            }
        }
        System.out.println(bottleOrder + " " + movements);
    }
}