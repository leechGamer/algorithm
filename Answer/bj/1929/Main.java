import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int max = s.nextInt();
        boolean[] check = new boolean[max+1];
        check[0] = check[1] = true;
        for (int i=2;i<=max;i++) {
            if (check[i] == false) { 
                for (int j=i+i;j<=max;j+=i) {
                    check[j] = true;
                }
            }    
        }
        for (int i=min;i<=max;i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
