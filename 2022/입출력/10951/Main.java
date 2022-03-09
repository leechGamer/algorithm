
import java.util.Scanner;

class Main {
     public static int solution(int a, int b) {
         return a+b;
     }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(solution(a, b));
        }
    }
}
