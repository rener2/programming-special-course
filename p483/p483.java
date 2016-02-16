/**
 * @author: <rerakk>
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner lause = new Scanner(System.in);
        while (lause.hasNext()) {
            String sisendLause = lause.nextLine();
            pooraSona(sisendLause);
            System.out.println();
        }
    }
    public static void pooraSona(String sisendLause) {
        List<String> list = new ArrayList<>(Arrays.asList(sisendLause.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            if(i == list.size() - 1) {
                System.out.print(list.get(i));
            } else System.out.print(list.get(i) + " ");
        }
    }
}
