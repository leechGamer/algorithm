import java.util.Scanner;

public class Main {
    private static int getGCD(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        if (a % b == 0) {
            return b;
        } else {
            return getGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int sPoint = s.nextInt();
        int[] arr = new int[count];
        for (int i=0;i<count;i++) {
            arr[i] = s.nextInt();
            int substracted = arr[i] - sPoint;
            if (substracted < 0) {
                substracted *= (-1);
            }
            arr[i] = substracted;
        }
        int result = arr[0];
        for (int i=1;i<arr.length;i++) {
            result= getGCD(result, arr[i]);
        }
        System.out.println(result);
    }
}
