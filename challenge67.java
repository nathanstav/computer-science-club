// INCOMPLETE

import java.util.*;

public class challenge67 {
    public static int newMeme(String input) {
        String[] inputs = input.split(" ");
        int toreturn = 0;


        int count1 = 0;
        for (int i = 0; i < inputs[1].length(); i++) {
            if (inputs[1].charAt(i) == inputs[0].charAt(0)) {
                count1++;
            }
        }

        inputs[1] = inputs[1].substring(inputs[1].indexOf(inputs[0].charAt(0)));

        for (int j = 0; j <= count1; j++) {
            if (inputs[1].indexOf(inputs[0].charAt(1)) == -1) break;

            String temp = inputs[1];
            while (temp.contains(inputs[0].substring(1,2))) {
                temp = temp.substring(0, temp.indexOf(inputs[0].charAt(1))) + temp.substring(temp.indexOf(inputs[0].charAt(1)) + 1);
                toreturn++;
            }

            inputs[1] = inputs[1].substring(1);
            if (inputs[1].indexOf(inputs[0].charAt(0)) == -1) break;
            inputs[1] = inputs[1].substring(inputs[1].indexOf(inputs[0].charAt(0)));
        }
        return toreturn;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(newMeme(input));
    }
}
