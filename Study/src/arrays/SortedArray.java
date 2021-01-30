package arrays;

public class SortedArray {
    public static void main(String[] args){
        int [] array=new int[] {5,3,1,0,10};
        int temp=0;
        System.out.println("Elements in array are:::");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        //Sorted Array Elements
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
       }
        System.out.println("Sorted Array is:::");
        for(int i:array){
            System.out.print(i+"\t");
        }
    }
}
