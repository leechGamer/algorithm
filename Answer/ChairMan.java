import java.util.Scanner;

public class ChairMan {
    /**
     5
     2 3 1 7 3
     4 1 9 6 8
     5 5 2 4 4
     6 5 2 6 7
     8 4 2 2 2
     */

    public static int solution(int[][] arr, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i=1;i<=n;i++) {
            int count = 0;
            for (int j=1;j<=n;j++) {
                for (int k=1;k<=5;k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer  = i;
            }
        }
        return answer;
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num+1][6];
        for (int i=1;i<arr.length;i++) {
            for (int j=1;j<arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print(solution(arr, num));
    }
}
