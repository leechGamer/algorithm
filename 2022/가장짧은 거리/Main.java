
import java.util.Scanner;

public class Main {
    /**
     * 10. 가장 짧은 문자거리
     * teachermode e
     *
     */

    static void solution(String input1, char input) {
        int distance = 1000;
        char[] inputArray = input1.toCharArray();
        int[] answer = new int[inputArray.length];
        for (int i=0;i<inputArray.length;i++) {
            if (inputArray[i] == input) {
                distance = 0;
                answer[i] = distance;
                continue;
            }
            answer[i] = ++distance;
        }

        distance = 1000;

        for (int j=inputArray.length-1;j>-1;j--) {
            if (answer[j] == 0 ) {
                distance = 0;
                continue;
            }

            if (answer[j] > ++distance) {
                answer[j] = distance;
            }
        }

        for (int k=0;k<inputArray.length;k++) {
            System.out.print(answer[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input1 = s.next();
        char input2 = s.next().charAt(0);
        solution(input1, input2);
    }
}
