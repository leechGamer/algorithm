
import java.util.Scanner;

class Main {
    public static int solution(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i=0;i<T;i++) {

            String[] input = s.next().split(",");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(solution(a, b));
        }
    }
}
