import java.util.Scanner;

class  Solution {
    public static String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] arr = new String[2];
        arr = input.split("=");
        String address = arr[1];
        String result = defangIPaddr(address);
        System.out.println(result);
    }
}


