import java.util.Scanner;

class Main {
    public static int solution(int N) {
        int count = 0;
        for (int i=1;i<1000;i++) {
            int total = i;
            int j = i+1;
            while (total < N) {
                total += j++;
                if (total == N) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(solution(N));
    }
}
