package hackerRankProblem;
import java.util.Scanner;
public class DatatypeDemo {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
       System.out.println("How many  numbers:::::");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x+"can be fitted in ");
                if (x >= -127 && x <= 128)
                    System.out.println("*byte");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                    System.out.println("*int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                    System.out.println("*long");

            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere");
            }
        }
    }
}