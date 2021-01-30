package method;
import java.util.Scanner;
public class AddRowElementsTwoDim {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row Size:::");

        int row=sc.nextInt();
        System.out.println("Enter the column Size:::");
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        System.out.println("Enter the array Elements:::");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements in Array are::::");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        AddRowElementsTwoDim obj=new AddRowElementsTwoDim();
        //obj.addElements(array,row,col);
        //obj.addEachRowElements(array,row,col);
        //obj.addEachColumnElements(array,row,col);
        obj.addDigonalElements(array,row,col);
        sc.close();


    }
    //Total sum of two dimesional array
    public static void addElements(int[][] array1,int row1,int column1){
        int i,j;int sum=0;
        for(i=0;i<row1;i++){
            for(j=0;j<column1;j++){
                sum=sum+array1[i][j];
            }
        }
        System.out.println("Sum of an Array is::"+sum);
    }
    //SUM OF EACH ROW OF AN ARRAY ELEMENTS
    public static void addEachRowElements(int[][] array,int row,int col){
        int i,j;
        for(i=0;i<row;i++){
            int sumRow=0;
            for(j=0;j<col;j++){
                sumRow=sumRow+array[i][j];
            }
            System.out.println("Sum of "+(i+1)+ " Row is:::"+sumRow);
        }
        System.out.println();
    }
    //SUM OF EACH COLUMN OF AN ARRAY ELEMENTS
    public static void addEachColumnElements(int[][] array,int row,int column){
        int i,j;
        for(i=0;i<column;i++){
            int sumColumn=0;
            for(j=0;j<row;j++){
                sumColumn=sumColumn+array[j][i];
            }
            System.out.println("Sum of "+(i+1)+" Column is:::"+sumColumn);
        }
        System.out.println();
    }
    public static void addDigonalElements(int[][] array,int row,int column){
        int i,j,sumDig=0;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                if(i==j){
                    sumDig=sumDig+array[i][j];
                }

            }
        }
        System.out.println(" Diagonal array elemts Sum::"+sumDig);
    }
}
