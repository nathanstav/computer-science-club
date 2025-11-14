import java.util.*;

public class challenge63 {
    public static String validateIP(String ip) {
        if (ip.contains(".")) {
            String v4possibilities = "1234567890.";

            int countdot = 0;
            for (int i = ip.length() - 1; i >= 0; i--) {
                if (ip.charAt(i) == '.') {
                    countdot++;
                }
                if (!v4possibilities.contains(String.valueOf(ip.charAt(i)))) {
                    return "Neither";
                }
            }
            if (countdot != 3) {
                return "Neither";
            }

            String[] v4parts = ip.split("\\.", -1);

            for (String part : v4parts) {
                if (part.isEmpty() || part.length() > 3) {
                    return "Neither";
                }
                if (Integer.parseInt(part) > 255) {
                    return "Neither";
                }
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return "Neither";
                }

            }

            return "IPv4";
        }
        if (ip.contains(":")) {
            String v6possibilities = "abcdefABCDEF1234567890:";
            int countcolon = 0;
            for (int i = ip.length() - 1; i >= 0; i--) {
                if (!v6possibilities.contains(String.valueOf(ip.charAt(i)))) {
                    return "Neither";
                }
                if (ip.charAt(i) == ':') {
                    countcolon++;
                }
            }

            if (countcolon != 7) {
                return "Neither";
            }


            String[] v6parts = ip.split(":", -1);

            for (String part : v6parts) {
                if (part.length() > 4 || part.isEmpty()) {
                    return "Neither";
                }
            }

            return "IPv6";
        }
        return "Neither";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ip = scan.nextLine();
        System.out.println(validateIP(ip));
    }
}
