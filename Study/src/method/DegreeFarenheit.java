package method;
import java.util.Scanner;
public class DegreeFarenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Degree Celsius:::::");
        float degree=sc.nextFloat();
        degreeCelsiusFarenheit(degree);
        sc.close();

    }
    public static void degreeCelsiusFarenheit(float degree){
        double farenHeit;
        farenHeit=(degree*9/5)+32;
        System.out.println("Degree celsius of " +degree+ "  FahrenHeit is::::"+farenHeit);
    }
}
