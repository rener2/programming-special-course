/**
 * @author: rerakk
 */
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedInputStream;
public class p10041 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int howMany = input.nextInt();
        for(int i = 0; i < howMany; ++i) {
            int esimene = input.nextInt();
            int[] numbers = new int[esimene];
            for (int j = 0; j < esimene; ++j) {
                numbers[j] = input.nextInt();
                }
            System.out.println(solution(numbers, esimene));
        }
    }


    public static int solution(int[] list, int esimene) {
        Arrays.sort(list, 0, esimene);
        int keskmine = list[esimene/2];
        int answer = 0;

        for (int i = 0; i < esimene; ++i) {
            answer += Math.abs(list[i] - keskmine);
        }
        return answer;
    }


}
