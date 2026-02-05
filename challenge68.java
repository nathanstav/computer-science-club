import java.util.*;

public class challenge68 {
    public static int noLaughingMatter(String input) {
        String newstring = "";

        for (int i = 0; i < input.length() - 1; i+= 2) {
            if (input.substring(i, i + 2).equals("ha")) {
                newstring += "ha";
            }
            else {
                newstring += " ";
            }
        }

        String[] hahas = newstring.split(" ");

        String longest = hahas[0];
        for (int i = 0; i < hahas.length; i++) {
            if (hahas[i].length() > longest.length())
                longest = hahas[i];
        }

        return longest.length() / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(noLaughingMatter(input));
    }
}
