package hackerRankProblem;
import java.util.Scanner;
public class StairCaseProblem {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit::");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-1-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();

        }

        }
    }

