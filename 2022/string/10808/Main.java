import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] S = s.next().toCharArray();
        int[] arr = new int[27];
        for (int i=0;i<S.length;i++) {
            int index = S[i];
            arr[index - 97] += 1;
        }

        for (int i=0;i<26;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

