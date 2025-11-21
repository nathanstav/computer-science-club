import java.util.*;

public class challenge64 {
    public static boolean canJump(int[] nums) {
        int reach = 0;

        int i;
        for (i = 0; i < nums.length && i <= reach; i++) {
            if (reach >= nums.length - 1)
                return true;
            if (i + nums[i] > reach)
                reach = i + nums[i];
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the nums with spaces in between:");
        String input = scan.nextLine();

        String[] numsstring = input.split(" ");
        int[] nums = new int[numsstring.length];

        for (int i = 0; i < numsstring.length; i++) {
            nums[i] = Integer.parseInt(numsstring[i]);
        }

        System.out.println(canJump(nums));
    }
}
