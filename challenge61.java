import java.util.*;

public class challenge61 {
    public static int find(char letter, String tofind) {
        for (int i = 0; i < tofind.length() - 1; i++) {
            if (tofind.charAt(i) - tofind.charAt(i + 1) > 0)
                return 1;
        }
        
        return (letter - tofind.charAt(tofind.length() - 1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char letter = input.charAt(0);
        String tofind = input.substring(2);

        System.out.println(find(letter, tofind));
    }
}