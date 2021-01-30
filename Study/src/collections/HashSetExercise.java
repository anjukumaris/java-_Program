package collections;

import java.util.Collections;
import java.util.HashSet;

public class HashSetExercise {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Kevin");
        set.add("Katie");
        set.add("George");
        set.add("Gus");
        set.add("Gus");

        System.out.println(set);
        for (String s:set){
            System.out.println(s);
        }

        System.out.println("Found : "+set.contains("Gus"));
        set.remove("Gus");
        System.out.println(set);

        set.remove(1);// hashset is not followed by order//
        System.out.println(set);
        


    }
}
