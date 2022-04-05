import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<N;i++) {
            list.add(s.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        int last = 100;
        for (int i=0;i<N;i++) {
            if (last == list.get(i)) {
                continue;
            }
            last = list.get(i);
            System.out.print(list.get(i) + " ");
        }
    }
}
