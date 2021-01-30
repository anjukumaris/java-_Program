package arrays;
import java.util.Scanner;
public class StringPalindromeBuffer {
    public static void main(String[] args){
       String  revstr="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String::");
        String str=sc.nextLine();
        StringBuffer strbuf=new StringBuffer(str);
        for(int i=strbuf.length()-1;i>=0;i--){
            char newchar=strbuf.charAt(i);
           revstr=revstr+newchar;
        }
        System.out.println("I entered String ::::"+strbuf);
        System.out.println("Reverse String ::::"+revstr);
        if(revstr.equals(strbuf)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
