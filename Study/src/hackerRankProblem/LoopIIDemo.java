package hackerRankProblem;
import java.sql.SQLOutput;
import java.util.Scanner;
public class LoopIIDemo {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            System.out.println("AAAAAAAAAAA::::");
            int a = sc.nextInt();
            System.out.println("BBBBBBBBBBBB::::");
            int b = sc.nextInt();
            System.out.println("NNNNNNNNNNNNNNNNNNNNN::::::");
            int n = sc.nextInt();

            int res = 0;
            for(int j=0;j<=n;j++){
                if(j==0) {
                    res += a + (Math.pow(2, j) * b);
                }
                else{
                    res+=(Math.pow(2,j)*b);
                }
                System.out.print(res+"\t");
            }
            System.out.println();

        }
        sc.close();
    }
}
