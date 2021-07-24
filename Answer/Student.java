import java.util.Scanner;

/*
8
130 135 148 140 145 150 150 153
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
(앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int max = 0; 
        int count = 0;
        for (int i=0;i<num;i++) {
           arr[i] = scanner.nextInt();
           if (i == 0) {
               count++;
               max =  arr[0];
           } else if (max < arr[i] && arr[i] > arr[i-1]) {
                count++;
                max = arr[i];
           }
        }
        System.out.print(count);
    }
}
