import java.util.*;

public class challenge77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        n -= 1;
        long k = scan.nextLong();
        long steps = k;

        if (n < k) {
            steps = n;
        }
        else {

            if ((n - n % k) > k) {
                steps ++;
            }

            steps += (n - (n - n % k));
        }


        System.out.println(steps);

    }

}