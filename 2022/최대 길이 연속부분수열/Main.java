import java.util.Scanner;

class Main {
    public static int solution(int M, int[] inputArr) {
        int i = 0;
        int max = 0;
        for (int j=0;j<inputArr.length;j++) {
            if (inputArr[j] == 1) {
                max = Math.max(max, j - i + 1);
                continue;
            }

            if (M <= 0) {
                while (true) {
                    if (inputArr[i] == 0) {
                        break;
                    }
                    i++;
                }
                i++;
                M++;
            }

            if (inputArr[j] == 0) {
                M--;
            }

            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextInt();
        }
        System.out.println(solution(M, input));
    }
}
