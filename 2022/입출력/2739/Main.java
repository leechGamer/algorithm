import java.util.Scanner;

public class Main {
    static void solution(int input) {
        for (int i=1;i<10;i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        solution(input);
    }
}
