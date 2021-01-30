package method;
import java.util.Scanner;
public class CentimeterInches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value in centimeter:::");
        float num=sc.nextFloat();
        cmToInches(num);
        sc.close();
    }
    public static void cmToInches(float number){
        double num1;
        num1=(0.3937)*number;
        System.out.println("The centimeter value "+number+"  in inches is::::"+num1);
    }
}
