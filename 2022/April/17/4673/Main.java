
public class Main {
    final static int MAX = 10000;
    public static void main(String[] args) {
        boolean[] arr = new boolean[MAX + 1];
        for (int i=1;i<MAX+1;i++) {
            int number = i;
            int sum = i;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum <= MAX && arr[sum] != true) {
                arr[sum] = true;
            }
        }

        for (int i=1;i<MAX+1;i++) {
            if (arr[i] != true) {
                System.out.println(i);
            }
        }
    }
}

