package arrays;
import java.util.Scanner;
import java.util.*;
public class StringPalindromeBufferReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String::::");
        String str=sc.nextLine();
        StringBuffer strbuf=new StringBuffer(str);
        StringBuffer strrev= strbuf.reverse();
        System.out.println("I Entered String ::::"+str);
        System.out.println("Reverse String :::"+strrev);
        if(strrev.equals(strbuf)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }



}
