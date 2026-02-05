import java.util.*;

public class challenge66 {
    public static void fancyFrames(String input) {
        String[] array = input.split(" ");
        String toreturn = "";

        String middletext = array[0];
        String material = array[1];
        int thickness = Integer.parseInt(array[2]);
        int padding = Integer.parseInt(array[3]);

        if (thickness == 0) {
            System.out.println(middletext);
            return;
        }

        for (int i = 0; i < middletext.length() + padding * 2; i++) {
            toreturn += material;
        }

        String thing = material.repeat(thickness * 2);
        toreturn += thing + "\n";
        if (thickness > 1) {
            toreturn += thing.repeat(thickness - 1) + material.repeat(middletext.length()) + "\n";
        }

        for (int j = 0; j < padding; j++) {
            toreturn += material.repeat(thickness) + (" ".repeat(middletext.length() + padding * 2)) + material.repeat(thickness) + "\n";
        }
        toreturn += material.repeat(thickness) + (" ".repeat(padding) + middletext + (" ".repeat(padding))) + material.repeat(thickness) + "\n";

        for (int k = 0; k < padding; k++) {
            toreturn += material.repeat(thickness) + (" ".repeat(middletext.length() + padding * 2)) + material.repeat(thickness) + "\n";
        }

        for (int p = 0; p < middletext.length() + padding * 2; p++) {
            toreturn += material;
        }

        toreturn += thing + "\n";
        if (thickness > 1) {
            toreturn += thing.repeat(thickness - 1) + material.repeat(middletext.length()) + "\n";
        }

        System.out.println(toreturn);



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        fancyFrames(scan.nextLine());
    }
}
