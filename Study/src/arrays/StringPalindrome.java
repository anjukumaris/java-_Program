package arrays;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args){
        String reversestr="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:::");
        String str=sc.nextLine();


        for(int i=str.length()-1;i>=0;i--){
        char newchar= str.charAt(i);
         reversestr=reversestr+newchar;
        }
             System.out.println("I entered String ::::"+str);
             System.out.println("The Reverse String ::::"+reversestr);
        if(reversestr.equals(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
