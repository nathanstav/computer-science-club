import java.util.*;

public class challenge57 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean bool = true;
      Stack<Character> stack = new Stack<Character>();
      String parentheses = scan.nextLine();
      for (int i = 0; i < parentheses.length(); i++) {
        if (parentheses.charAt(i) == '(' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '{')
          stack.push(parentheses.charAt(i));
        else if (parentheses.charAt(i) == ')' || parentheses.charAt(i) == ']' || parentheses.charAt(i) == '}') {
          if (stack.isEmpty()) {
            bool = false;
            break;
          }
          else {
            char top = stack.pop();
            if (parentheses.charAt(i) == ')' && top != '(' && parentheses.charAt(i) == ']' && top != '[' && parentheses.charAt(i) == '}' && top != '{') {
              bool = false;
              break;
            }
          }
        }
      }
      if (!stack.isEmpty())
        bool = false;

      System.out.println(bool);
      
    }
  }