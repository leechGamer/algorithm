import java.util.Scanner;

class Main {
    public static int solution(int M, int[] numbers) {
        int count = 0;
        for (int i=0;i<numbers.length;i++) {
            int total = numbers[i];
            int j = i + 1;
            while (j< numbers.length && total < M) {
                total += numbers[j++];
                if (total == M) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i=0;i<N;i++) {
           numbers[i] = scanner.nextInt();
        }
        System.out.println(solution(M, numbers));
    }
}
