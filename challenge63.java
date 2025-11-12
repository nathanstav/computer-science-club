import java.util.*;

public class challenge63 {
    public static String validateIP(String ip) {
        if (ip.contains(".")) {
            String possibilities = "123456789.";

            if (ip.contains(":")) {
                return "Neither";
            }
            int countdot = 0;
            for (int i = ip.length() - 1; i >= 0; i--) {
                if (ip.charAt(i) == '.') {
                    countdot++;
                }
                if (!possibilities.contains(String.valueOf(ip.charAt(i)))) {
                    return "Neither";
                }
            }
            if (countdot != 3) {
                return "Neither";
            }

            String[] parts = ip.split("\\.");

            for (String part : parts) {
                if (Integer.parseInt(part) > 255 || Integer.parseInt(part) < 0) {
                    return "Neither";
                }
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return "Neither";
                }
                if (part.length() > 4 || part.isEmpty()) {
                    return "Neither";
                }
            }

            return "IPv4";
        }
        if (ip.contains(":")) {
            String possibilities2 = "abcdefABCDEF123456789:";

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ip = scan.nextLine();
        System.out.println(validateIP(ip));
    }
}
