package hackerRankProblem;
import java.util.Scanner;
public class LoopsDemo {
    public static void main(String[] ar)

    {
        int num=1;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i<=10;i++){
            int res=num*i;
            System.out.println(num+" X "+i+" = "+res);
        }
        sc.close();

    }
}