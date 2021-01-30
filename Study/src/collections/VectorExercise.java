package collections;

import java.util.Collections;
import java.util.Vector;

public class VectorExercise {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("Sam");
        vector.add("Samanta");
        vector.add(1,"Zilda");
        vector.add("Spencer");
        System.out.println(vector);
        System.out.println("Found : " + vector.contains("Samanta"));
        Collections.sort(vector);
        for (String vc : vector){
            System.out.println(vc);
        }
        vector.set(1,"Kim");
        System.out.println(vector);
        vector.remove("Spencer");
        vector.remove(0);
        System.out.println(vector);
    }
}
