import java.util.Arrays;

/**
 * @author: rerakk
 * @author: brpung
 */
import java.util.Scanner;
class p443 {
    public static void main(String[] args) {
        long[] uglyNumbers = find();
        Scanner sisend = new Scanner(System.in);
        while (sisend.hasNextInt()) {
            int input = sisend.nextInt();
            if(input <= 5842 && input > 0){
                String suffix = suffix(input);
                System.out.println("The "+input+""+suffix+" humble number is "+uglyNumbers[input-1]+".");
        }}



    }

    public static boolean contains(long[] list, long number) {
        boolean exists = false;
        for (int x = 0; x < 5842; x++) {
            if (list[x] == number) {
                exists = true;
            }
        }
        return exists;
    }

    public static long[] find() {
        long[] uglyNumbers = new long[8000];

        Arrays.fill(uglyNumbers, 100000000000000000L);
        uglyNumbers[0] = 1;

        for (int i = 0; i < 8000; i++) {

            long[] numbers = {uglyNumbers[i] * 2, uglyNumbers[i] * 3, uglyNumbers[i] * 5,uglyNumbers[i] * 7};

            for (int j = 0; j < 4; j++) {

                if (!contains(uglyNumbers, numbers[j])) {
                    //System.out.println(numbers[0]);

                    for (int z = 0; z < 8000; z++) {

                        if (uglyNumbers[z] == 100000000000000000L) {
                            uglyNumbers[z] = numbers[j];
                            Arrays.sort(uglyNumbers);
                            break;
                        }
                    }
                }
            }

        }
        return uglyNumbers;
    }

    public static String suffix(int number) {
        String suffix = "";

        String[] list = {"th","st","nd","rd","th","th","th","th","th","th"};
        if ((number %100) >= 11 && (number%100) <= 13)
            suffix = "th";
        else
        suffix = list[number % 10];


        return suffix;
    }
}


