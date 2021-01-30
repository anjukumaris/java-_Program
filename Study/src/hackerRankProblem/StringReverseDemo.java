package hackerRankProblem;
import java.util.Scanner;
public class StringReverseDemo {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:::");
        String str=sc.next();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        System.out.println("Reverse String is::::"+revStr);
        if(revStr.equals(str)){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
