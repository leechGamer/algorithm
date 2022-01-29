
import java.util.Scanner;

public class Main {
    /*
     * 2. 보이는 학생
     * 8
     * 130 135 148 140 145 150 150 153
     *
     * */
    public static int solution(int[] inputArray) {
        int count = 1;
        int max = inputArray[0];
        for (int i=1;i<inputArray.length;i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        for (int i=0;i< input.length;i++) {
            input[i] = scanner.nextInt();
        }
        int answer = solution(input);
        System.out.print(answer);
    }
}
