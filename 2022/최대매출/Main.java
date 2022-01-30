import java.util.Scanner;

public class Main {
    /*
     * 3. 최대 매출
     * 10 3
     * 12 15 11 20 25 10 20 19 13 15
		 * n
     * */
    public static int solution(int day, int[] input) {
        int amount = 0;
        int count = 0;
        while (count < day) {
            amount += input[count];
            count++;
        }

        int max = amount;

        for (int i=1;i<input.length-day;i++) {
            amount = amount - input[i-1] + input[i+day-1];
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int day = scanner.nextInt();
        int[] input = new int[num];
        for (int i=0;i<num;i++) {
            input[i] = scanner.nextInt();
        }
        int answer = solution(day, input);
        System.out.print(answer);
    }
}
