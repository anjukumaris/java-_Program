package arrays;
import java.util.Scanner;
public class StringPalBufReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String::::");
        String str = sc.nextLine();
        StringBuffer strbuf = new StringBuffer(str);
        String str1 = strbuf.reverse().toString();
        //System.out.println(str1);
        System.out.println("I Entered String:::"+str);
        System.out.println("Reverse String:::"+str1);
    }
}
