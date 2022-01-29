import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
     * 11. 문자열 압축
     * KKHSSSSSSSE
     * KSTTTSEEKFKKKDJJGG
     * */
    public static ArrayList solution(String input) {
        char[] inputArray = input.toCharArray();
        char target = inputArray[0];
        int count = 1;
        ArrayList answer = new ArrayList();

        for (int i=1;i<inputArray.length;i++) {
            if (target == inputArray[i]) {
                count++;
                continue;
            }
            answer.add(target);

            if (count != 1) {
                answer.add(count);
            }
            target = inputArray[i];
            count = 1;
        }

        answer.add(target);
        if (count != 1) {
            answer.add(count);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        ArrayList answer = solution(input);
        for (int i=0;i<answer.size();i++) {
            System.out.print(answer.get(i));
        }
    }
}
