/**
 * @author: <sisams>
 * @author: <ilsamo>
 * @author: <rerakk>
 */
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int enteredValue;
            enteredValue = in.nextInt();
            System.out.println(digitCount(enteredValue));
        }
    }

    public static int digitCount(int input) {
        int current = 1;
        int count = 1;
        while (current % input != 0) {
            current = (current * 10 + 1) % input;
            count++;
        }
        return count;
    }
}
