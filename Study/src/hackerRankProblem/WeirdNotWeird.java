package hackerRankProblem;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class WeirdNotWeird {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0) {
            if ((n>=2 && n<=5)||(n>=20)) {
                System.out.println("Weird");
            }
            else
            System.out.println("Not Weird");
        }
        else
            System.out.println("weird");
        sc.close();
    }


}