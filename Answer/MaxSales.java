import java.util.*;

public class MaxSales {
    /**
     10 3
     12 15 11 20 25 10 20 19 13 15
     */

    public static int solution(int m, int[] arr) {
        int sum = 0;
        ArrayList<Integer> elements = new ArrayList<>();

        for (int i=0;i<m;i++) {
            sum += arr[i];
        }
        elements.add(sum);

        for (int i=0;i<arr.length-m-1;i++) {
            sum = sum - arr[i] + arr[i + m];
            elements.add(sum);
        }

        return Collections.max(elements);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        int answer = solution(m, arr);
        System.out.print(answer);
    }
}
