import java.util.Scanner;

/**
 * @author rerakk
 *         ansalt
 */
class p543 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()) {
            int finalPrime1 = 0;
            int finalPrime2 = 0;
            int number = input.nextInt();
            int count = number;
            if (number == 0) {
                break;
            }
            for (int i = 0; i < number; i++) {
                count -= 1;
                if (isPrime(count)) {
                    int otherPrime = number - count;
                    if (isPrime(otherPrime)) {
                        if (finalPrime1 == 0) {
                            finalPrime1 = count;
                            finalPrime2 = otherPrime;
                            break;
                        }
                    }
                }
            }
            if (finalPrime1 < finalPrime2) {
                System.out.println(number + " = " + finalPrime1 + " + " + finalPrime2);
            }
            else {
                System.out.println(number + " = " + finalPrime2 + " + " + finalPrime1);
            }
        }

    }
    public static boolean isPrime(int number) {

        if (number % 2 == 0 || number == 1) {
            return false;
        }
        for (int i = 3; i*i <= number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
