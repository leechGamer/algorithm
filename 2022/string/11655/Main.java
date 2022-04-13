
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] arr = s.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++) {
            if (arr[i] <= 'Z' && arr[i] >= 'A') {
                char x = (char) (arr[i] + 13);
                if (x > 'Z') {
                    x -= 26;
                }
                sb.append(x);
            } else if (arr[i] <= 'z' && arr[i] >= 'a') {
                char x = (char) (arr[i] + 13);
                if (x > 'z') {
                    x -= 26;
                }
                sb.append(x);
            } else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}

