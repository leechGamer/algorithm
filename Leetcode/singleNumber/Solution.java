
import java.util.*;

public class Solution {
    public static int singleNumber(int[] nums) {
        //Arrays.sort(nums);
        int result = nums[0];
            for (int i=1; i<nums.length; i++) {
                System.out.println(result+ "*** "+nums[i]);
                result ^= nums[i];    
            }
        return result;
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace("[", "");
        input = input.replace("]", "");
        input = input.replace(",", "");
        String[] arr = input.split("");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(singleNumber(nums));
    }
}
