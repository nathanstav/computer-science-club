import java.util.*;
import java.lang.Math;

public class challenge65 {
    public static int trap(int[] map) {
        int total = 0;

        int[] greatestleft = new int[map.length];
        int[] greatestright = new int[map.length];

        for (int l = 0; l < map.length; l++) {
            greatestleft[l] = map[0];
            greatestright[l] = map[map.length - 1];
        }


        for (int i = 0; i < map.length; i++) {
            if (map[i] > greatestleft[i])
                greatestleft[i] = map[i];
        }
        for (int j = map.length - 1; j >= 0; j--) {
            if (map[j] > greatestright[j])
                greatestright[j] = map[j];
        }

        for (int x = 0; x < map.length; x++) {
            total += Math.min(greatestleft[x], greatestright[x] - map[x]);
        }

        for (int a : greatestleft) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b : greatestright) {
            System.out.print(b + " ");
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tempstring = scan.nextLine();
        String[] temparray = tempstring.split(",");

        int[] input = new int[temparray.length];

        for (int i = 0; i < temparray.length; i++) {
            input[i] = Integer.parseInt(temparray[i]);
        }

        System.out.println(trap(input));
    }
}
