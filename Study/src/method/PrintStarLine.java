package method;
import java.util.Scanner;
public class PrintStarLine {
    public static void starLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit::");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.print("*");
            sc.close();
        }

    }

    public static void main(String[] args) {
        PrintStarLine obj=new PrintStarLine();
        obj.starLine();


    }
}
