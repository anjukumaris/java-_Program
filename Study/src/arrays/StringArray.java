package arrays;

public class StringArray {
    public static void main(String[] args){
        String[] fruits={"Apple","Orange","Grapes","Pear"};
        System.out.println("String Fruit list is::::");
        for(int i=0;i<=fruits.length-1;i++){
            System.out.print(" " +fruits[i]);
        }
        System.out.println("\n reverse String Fruit list is::::");
        for(int i=fruits.length-1;i>=0;i--){
            System.out.print(" " +fruits[i]);
        }
    }
}
