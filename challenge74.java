import java.util.*;
import java.util.stream.*;

public class challenge74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many ranges?");
        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<ArrayList<Integer>> ranges = new ArrayList<ArrayList<Integer>>();

        int[][] input = new int[n][2];

        int max = 0;

        String[] binaries = new String[n];

1         for (int i = 0; i < n; i++) {
            String[] parts = scan.nextLine().split(" ");
            input[i][0] = Integer.parseInt(parts[0]);
            input[i][1] = Integer.parseInt(parts[1]);
            int[] range = IntStream.rangeClosed(input[i][0], input[i][1]).toArray();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x : range) {
                temp.add(x);
            }
            ranges.add(temp);

            max = Math.max(max, input[i][1]);
        }
        
        scan.close();

        int[] binaryints = new int[n];
        int number = n + 0;

        for (int i = 0; i < n; i++) {
            binaries[i] = "0".repeat(max + 1);
            for (int j = 0; j < ranges.get(i).size(); j++) {
                char[] temp = binaries[i].toCharArray();
                int index = ranges.get(i).get(j);
                temp[index] = '1';
                binaries[i] = String.valueOf(temp);
            }
            binaryints[i] = Integer.parseInt(binaries[i], 2);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < ranges.size(); j++) {
                if ((binaryints[i] & binaryints[j]) > 0) {
                    number--;
                    ranges.remove(j);
                }
            }
        }

        System.out.println(number);
    }
}