
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        IntStream numbers = Arrays.stream(s.next().split("")).mapToInt(a -> Integer.parseInt(a));
        System.out.println(numbers.sum());
    }
}
