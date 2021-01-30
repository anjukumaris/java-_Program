package hackerRankProblem;

import java.util.ArrayList;
import java.util.List;

public class DiagonalElemtsDifference {
    public static void main(String[] ar) {
        int n = 3;

        List<List<Integer>> arr = new ArrayList<>(n);
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(11);
        firstRow.add(2);
        firstRow.add(4);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(4);
        secondRow.add(5);
        secondRow.add(6);
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(10);
        thirdRow.add(8);
        thirdRow.add(-12);
        arr.add(firstRow);
        arr.add(secondRow);
        arr.add(thirdRow);
        System.out.println("ArrayList are::::\n");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        System.out.println("Difference:::::");
//        int leftSum = 0, rightSum = 0;
//
//        for (int i = 0; i < arr.size(); i++) {
//            leftSum += (arr.get(i)).get(i);
//            System.out.print((arr.get(i)).get(i) + "\t");
//        }
//
//
//        System.out.println();
//
//        for (int i = 0, j = arr.size()-1 ; i <arr.size() && j >= 0; i++, j--) {
//            rightSum += (arr.get(i)).get(j);
//            System.out.print((arr.get(i)).get(j) + "\t");
//        }
//            int result = Math.abs(leftSum - rightSum);
//            System.out.println("\n"+result);

        int d1=0,d2=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){

               if(i==j){

                   d1+=arr.get(i).get(j);
               }

               if(i==arr.size()-j-1){

                   d2+=arr.get(i).get(j);
               }

            }

        }

        System.out.println("\n"+Math.abs(d1-d2));
        }
    }
