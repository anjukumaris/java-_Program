package arrays;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SortedArray1 {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an array::");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Elements in array are:::");
        for(int i=0;i<size;i++){
             array[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:::");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        //Sorted array elements are
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Sorted array elements are:::");
        for(int i:array){
            System.out.print(i+"\t");
        }

    }
}
