package method;
import java.util.Scanner;
public class AddNumbersArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array::");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter Array Elements :::");
        for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
        }
        System.out.println("The Elements In Array:::");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+ "\t");
        }
        int sum=addArray(array,size);
        System.out.println("-----------------------");
        System.out.println("\nSum of Array is::"+sum);
        sc.close();
    }
    public static int addArray(int[] array1,int size1){
        int sum=0;
        for(int i=0;i<size1;i++) {
            sum = sum + array1[i];
        }
        return sum;
    }
}
