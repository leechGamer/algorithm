import java.util.Scanner;

public class Main {
    private static int getGCD(int a, int b) {
        int gcd = 0;
        int first = a;
        int second = b;
       
        if (a < b) {
            first = b;
            second = a;
        }

        if (b == 0) {
            gcd = first;
        } else {
            gcd = getGCD(second, first % second);
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        while (count-- > 0) {
            long result = 0;
            int num = s.nextInt();
            int[] array = new int[num];
            for (int i=0;i<array.length;i++) {
                array[i] = s.nextInt();
            }
            for (int j=0;j<array.length-1;j++) {
                int k = j + 1;
                while (k < array.length) {
                    result += getGCD(array[j], array[k]);
                    k++;
                }
            }
            System.out.println(result);
        }
    }
}
