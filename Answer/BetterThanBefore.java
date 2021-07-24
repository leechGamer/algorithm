
import java.util.Scanner;

public class BetterThanBefore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<num;i++) {
           arr[i] = scanner.nextInt();
           if (i == 0) {
               System.out.print(arr[i]+" ");
           } else if (i-1 >= 0 && arr[i] > arr[i-1]) {
               System.out.print(arr[i]+" ");
           }
        }
    }
}
