import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next().toLowerCase();
        char target = Character.toLowerCase(s.next().charAt(0));
        int count = 0;
        for (int i=0;i<text.length();i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}

