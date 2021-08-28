
import java.util.Scanner;

public class Mentoring {
    /**
     4 3
     3 4 1 2
     4 3 2 1
     3 1 4 2
     */

    public static int solution(int[][] arr, int n, int m) {
        int answer = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) { 
                int count = 0;
                for (int k=0;k<m;k++) { 
                    int x = 100;
                    int y = 100;
                    for (int s=0;s<n;s++) {
                        if (arr[k][s] == i+1) {
                            x = s;
                        }

                        if (arr[k][s] == j+1) {
                            y = s;
                        }
                    }
                    System.out.println(x+","+y+")  " +"("+(i+1)+", "+(j+1)+")");
                    if (x < y) {
                        count++;
                    }
                }
                System.out.println(count);
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print(solution(arr, n, m));
    }
}
