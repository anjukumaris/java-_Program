package hackerRankProblem;

public class Hare {
    public static void main(String ar[]){
        int hare = 5;
        int tortoise = 11;
        int j = 0;

        for(j=0;j<20;j++)
        {
            if(hare < tortoise)
                hare *= 2;
            else if(hare == tortoise)
                break;
            else
                tortoise += 1;
        }
        System.out.println(hare + tortoise);




    }
}
