import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String[] arr = new String[S.length()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = S.substring(i);
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}

