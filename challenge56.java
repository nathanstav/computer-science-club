import java.util.*;

public class challenge56 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many classes?");
      int numofclasses = scan.nextInt();
      scan.nextLine();
      int[] periods = new int[numofclasses];
      String[] classes = new String[numofclasses];
      System.out.println("Enter your classes:");


      for (int i = 0; i < numofclasses; i++) {
        String[] thing = scan.nextLine().split(" ", 2);
        periods[i] = Integer.parseInt(thing[0]);
        classes[i] = thing[1];
      }

      


      for (int i = 0; i < numofclasses - 1; i++) {
            for (int j = 0; j < numofclasses - i - 1; j++) {
                if (periods[j] > periods[j + 1]) {
                    int temp = periods[j];
                    String temp2 = classes[j];
                    periods[j] = periods[j + 1];
                    classes[j] = classes[j + 1];
                    periods[j + 1] = temp;
                    classes[j + 1] = temp2;
                }
            }
        }

      for (int i = 0; i < numofclasses; i++) {
        System.out.println("\n" + periods[i] + " " + classes[i]);
      }
      
    }
  }