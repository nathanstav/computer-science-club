import java.util.*;

public class challenge60 {

  public static ArrayList<Integer> prefSum(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> prefixSum = new ArrayList<>();

        prefixSum.add(arr[0]);

        for (int i = 1; i < n; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);

        return prefixSum;
    }
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String nandk = scan.nextLine();
      int n = Integer.parseInt(nandk.substring(0, 1));
      int k = Integer.parseInt(nandk.substring(2));

      String cheststringarr[] = scan.nextLine().split(" ");
      int chests[] = new int[n];

      for (int i = 0; i < cheststringarr.length; i++)
        chests[i] = Integer.parseInt(cheststringarr[i]);

      ArrayList<Integer> prefixsum = prefSum(chests);
      prefixsum.add(0, 0);

      int greatest = Integer.MIN_VALUE;

      for (int i = 0; i < prefixsum.size() - k; i++) {
        if (prefixsum.get(i + k) - prefixsum.get(i) > greatest)
          greatest = prefixsum.get(i + k) - prefixsum.get(i);
      }
      System.out.println(greatest);
    }
  }