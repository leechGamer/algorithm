import java.util.*;

public class Main {
    /*
     * 임시반장 정하기
     * 5
     * 2 3 1 7 3
     * 4 1 9 6 8
     * 5 5 2 4 4
     * 6 5 2 6 7
     * 8 4 2 2 2
     * */
    public static int solution(int[][] input) {
        int[] answer = new int[input.length];
        for (int t=0;t<answer.length;t++) {
            for (int other=0;other<answer.length;other++) {
                int grade = 0;
                if (t != other) {
                    while (grade < 5) {
                        int target = input[t][grade];
                        int classNumber = input[other][grade];
                        if (classNumber == target) {
                            answer[t] += 1;
                            break;
                        }
                        grade++;
                    }
                }
            }

        }
        int max = answer[0];
        int leader = 1;
        for (int i=1;i<answer.length;i++) {
            if (answer[i] > max) {
                max = answer[i];
                leader = i + 1;
            }
        }
        return leader;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[][] input = new int[num][5];
        for (int i=0;i<input.length;i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(input));
    }
}
