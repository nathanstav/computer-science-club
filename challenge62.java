import java.util.*;
// not working
public class challenge62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nandm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nandm[0]);
        int m = Integer.parseInt(nandm[1]);

        ArrayList<Integer> ulist = new ArrayList<Integer>();
        ArrayList<Integer> vlist = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            String[] uandv = scan.nextLine().split(" " );

            int u = Integer.parseInt(uandv[0]);
            int v = Integer.parseInt(uandv[1]);

            ulist.add(u);
            vlist.add(v);
        }

        int umax = Integer.MIN_VALUE;
        int umin = Integer.MAX_VALUE;
        int vmax = Integer.MIN_VALUE;
        int vmin = Integer.MAX_VALUE;


        for (int i = 0; i < ulist.size(); i++) {
            if (ulist.get(i) > umax) {
                umax = ulist.get(i);
            }
            if (ulist.get(i) < umin) {
                umin = ulist.get(i);
            }
            if (vlist.get(i) > vmax) {
                vmax = vlist.get(i);
            }
            if (vlist.get(i) < vmin) {
                vmin = vlist.get(i);
            }
        }

        System.out.println(Math.max(umax - vmin, vmax - umin));
    }
}