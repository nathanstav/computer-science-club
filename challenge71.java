import java.util.*;

public class challenge71 {
    public static String twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;

                if (nums[i] + nums[j] == target) {
                    return i + " " + j;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] temp = scan.nextLine().split(" ");
        int[] input = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            input[i] = Integer.parseInt(temp[i]);
        }
        int target = scan.nextInt();

        System.out.println(twoSum(input, target));
    }
}
