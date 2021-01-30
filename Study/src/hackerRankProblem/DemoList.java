package hackerRankProblem;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DemoList {
    public static void  main(String[] ar) {
        int n = 3;
        ArrayList<ArrayList<Integer>> aList =
                new ArrayList<ArrayList<Integer>>(n);

        // Create n lists one by one and append to the
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(11);
        a1.add(2);
        a1.add(4);
        aList.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        aList.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(8);
        a3.add(-12);
        aList.add(a3);

        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal difference");
        int leftSum=0,rightSum=0;
        for(int i=0;i<aList.size();i++) {
            //for (int j = 0; j < aList.get(i).size(); j++) {
                leftSum = leftSum + (aList.get(i)).get(i);
                System.out.print((aList.get(i)).get(i)+"\t");
            }
        System.out.println();

         for(int i=0,j=aList.size()-1;i<aList.size()&&j>=0;i++,j--) {

                rightSum = rightSum + (aList.get(i)).get(j);
                System.out.print((aList.get(i)).get(j)+"\t");
            }

        System.out.println("\n"+Math.abs(leftSum-rightSum));

}

}




