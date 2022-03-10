
import java.util.Scanner;

public class Main {
    static void solution(int input) {
        for (int i=input;i>0;i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        solution(input);
    }
}

