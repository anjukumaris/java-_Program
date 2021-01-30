package hackerRankProblem;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] ar){
        List<Integer>a=new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer>b=new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
       // a.addAll(b);
        System.out.println("Elements are :::\n");
        for(int i=0;i<a.size();i++) {
            System.out.println(a.get(i)+"\t"+b.get(i));
        }
        List<Integer>compareTriplets=new ArrayList<>();
//        int aliceTotalScore=0,bobTotalScore=0;
//        for(int i=0;i<a.size();i++){
//            int aliceScore=a.get(i);
//            int bobScore=b.get(i);
//            if(aliceScore!=bobScore){
//                if(aliceScore>bobScore){
//                    aliceTotalScore++;
//                }
//                else{
//                    bobTotalScore++;
//                }
//            }
//        }
//        List<Integer>result=new ArrayList<>();
//        result.add(aliceTotalScore);
//        result.add(bobTotalScore);
//        System.out.println("Score:::::"+result);
        List<Integer>result=new ArrayList<>();
        result.add(0);
        result.add(0);
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                int aliceScore=result.get(0)+1;
                result.set(0,aliceScore);
            }else if(a.get(i)<b.get(i)){
                int bobScore=result.get(1)+1;
                result.set(1,bobScore);

            }
        }
        System.out.println("Result::::"+result);


    }
}
