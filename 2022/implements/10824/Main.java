import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i=0;i<4;i++) {
            arr[i] = s.next();
        }
        String aString = arr[0] + arr[1];
        String bString = arr[2] + arr[3];

        long a = Long.parseLong(aString);
        long b = Long.parseLong(bString);
        long result = a + b;
        System.out.print(result);
    }
}

