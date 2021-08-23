import java.util.Scanner;
/**
     상하, 좌우보다 크면
     5
     5 3 7 2 3
     3 7 1 6 1
     7 2 5 3 4
     4 3 6 4 1
     8 7 3 5 2    
 */
class Peaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];
        int answer = 0;
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
      
      
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int left = 0;
                int right = 0;
                int top = 0;
                int down = 0;
                int target = arr[i][j];

                if (i-1 >= 0) {
                    top = arr[i-1][j];
                }
                if (i+1 < arr.length) {
                    down = arr[i+1][j];
                }
                if (j-1 >= 0) {
                    left = arr[i][j-1];
                }
                if (j+1 < arr[i].length) {
                    right = arr[i][j+1];
                }

                if (down < target && top < target) {
                    if (right < target && left < target) {
                        answer++;
                    }
                } else {
                    continue;
                }
            }
        }
        System.out.print(answer);
    }
}
