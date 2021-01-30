package simpleProgram.one;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        int radius;
        double pi = 3.14, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        radius = sc.nextInt();
        area = pi * radius * radius;
        System.out.println("Area of circle:"+area);
            }
        }




