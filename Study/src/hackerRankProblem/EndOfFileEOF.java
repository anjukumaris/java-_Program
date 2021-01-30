package hackerRankProblem;
import java.util.Scanner;
public class EndOfFileEOF {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(i + "  " + str);

            i++;
        }
    }

}
