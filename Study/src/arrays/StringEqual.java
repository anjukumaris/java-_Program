package arrays;
import java.util.Scanner;
public class StringEqual {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first String::::");
        String str=scan.nextLine();
        System.out.println("Enter Second String::::");
        String str1=scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){

        }
        System.out.println("First String is::::"+str);
        System.out.println("Second String::::"+str1);
        if(str1.equals(str)){
            System.out.println("Both String are Equals");
        }
        else{
            System.out.println("both string are Not Equals");
        }
    }

    }
