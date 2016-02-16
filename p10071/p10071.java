/**
 * @author: <rerakk>
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner lause = new Scanner(System.in);
        while (lause.hasNextInt()) {
            int kiirus = lause.nextInt();
            int aeg = lause.nextInt();
            System.out.println(2 * kiirus * aeg);
        }
    }
}


