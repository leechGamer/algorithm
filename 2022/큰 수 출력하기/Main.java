import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
     * 1. 큰수 출력하기
     *
     * 6
     * 7 3 9 5 6 12
     *
     * */
    public static ArrayList solution(int[] inputArray) {
        int before = inputArray[0];
        ArrayList answer = new ArrayList();
        answer.add(before);
        for (int i=1;i< inputArray.length;i++) {
            if (before < inputArray[i]) {
                answer.add(inputArray[i]);
            }
            before = inputArray[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        for (int i=0;i< input.length;i++) {
            input[i] = scanner.nextInt();
        }
        ArrayList answer = solution(input);
        for (int i=0;i< answer.size();i++) {
            System.out.print(answer.get(i)+ " ");
        }
    }
}
