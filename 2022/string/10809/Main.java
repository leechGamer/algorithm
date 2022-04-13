import java.util.*;

class Main {
    static final int a = 97;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        char[] S = s.next().toCharArray();
        for (int i=0;i<S.length;i++) {
            int n = S[i];
            if (arr[n - a] == -1) {
                arr[n - a] = i;
            } else {
                continue;
            }
        }

        for (int i=0;i<26;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
