package arraysTwoDimension;
import java.util.Scanner;
public class TwoDimensionArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row Limit::");
        int row=sc.nextInt();
        System.out.println("Enter Colomn Limit::");
        int col=sc.nextInt();
        int[][] num=new int[row][col];
        System.out.println("Enter Elements:::");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {

                num[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Elements in Two Dimensional array are::");
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
