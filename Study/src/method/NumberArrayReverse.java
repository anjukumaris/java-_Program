package method;
import java.util.Scanner;
public class NumberArrayReverse {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array::");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the Elements in an array:::");
        for(i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements in an Array :::");
        for(i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        NumberArrayReverse obj=new NumberArrayReverse();
        obj.reverseSumArray(array);
        sc.close();

    }
    public static void reverseSumArray(int[] array){
        int sum=0;
        System.out.println("Array Elements in Reverse Order:::");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}
