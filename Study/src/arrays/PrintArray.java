package arrays;

public class PrintArray {

    public static void main(String[] args){
        int[] n={10,20,30,40,50};
       // int max=n[0];
        System.out.println("Array List is::::");
        for(int i=0;i<=n.length-1;i++){
           // if(max>n[i]) {
              //  max = n[i];
          //  }
            System.out.print( n[i]+"\t");

        }
        System.out.println("\n Reverse of Array:::");
        for(int i=n.length-1;i>=0;i--){
            System.out.print(n[i]+" ");
        }
    }
}
