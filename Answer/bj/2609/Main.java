import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    public static int lcm (int a, int b) {
        int g = gcd(a, b);
        int l = g * (a/g) * (b/g);
        return l;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[]inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);
        int g = gcd(a, b);
        int l = g * (a/g) * (b/g);

        System.out.println(g);
        System.out.println(l);
    }
}
