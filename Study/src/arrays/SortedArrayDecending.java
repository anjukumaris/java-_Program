package arrays;
import java.util.Scanner;
public class SortedArrayDecending {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array::");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the Array Elements Are::");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Elements in array are::");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        //Sorted array elements
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[j]>array[i]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println("Sorted array elements are:::");
        for(int i:array){
            System.out.print(i+"\t");
        }
    }
}
