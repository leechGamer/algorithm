
import java.util.Scanner;


public class Main {
    static void solution(int n) {
        int answer = 0;
        for (int i=1;i<n+1;i++) {
            answer += i;
        }
        System.out.print(answer);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution(n);
    }
}

