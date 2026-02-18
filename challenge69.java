import java.util.*;

public class challenge69 {
    public static int grant(int b, int grant) {
        if (!(check(b, grant))) {
            return (int) (b + Math.pow(2, grant));
        }
        return b;
    }

    public static int revoke(int b, int revoke) {
        if (check(b, revoke)) {
            return (b - (int) Math.pow(2, revoke));
        }
        return b;
    }

    public static boolean check(int b, int check) {
        int val = (1 << check);

        if ((b & val) != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int b = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<String> outputs = new ArrayList<String>();

        for (int i = 0; i <= n; i++) {
            String temp = scan.nextLine();
            if (temp.contains("GRANT")) {
                String[] thing = temp.split(" ");
                b = grant(b, Integer.parseInt(thing[1]));
            }
            else if (temp.contains("CHECK")) {
                outputs.add(check(b, Integer.parseInt(temp.split(" ")[1])) ? "yes" : "no");
            }
            else if (temp.contains("REVOKE")) {
                String[] thing = temp.split(" ");
                b = revoke(b, Integer.parseInt(thing[1]));
            }
        }

        for (String obj : outputs) {
            System.out.println(obj);
        }
        System.out.println(b);

    }
}
