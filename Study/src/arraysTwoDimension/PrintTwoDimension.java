package arraysTwoDimension;

public class PrintTwoDimension {
    public static void main(String[] args){
        int num[][]={{10,20,30},{40,50,60},{70,80,90}};
        System.out.println("Row Number::"+num.length);
        System.out.println("Elements in two dimensional  array are::::");
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
