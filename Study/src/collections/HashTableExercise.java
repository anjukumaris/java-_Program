package collections;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args){
        Hashtable<String,String> hashtable = new Hashtable<>();

        hashtable.put("Name","Alex");
        hashtable.put("Address","20 Maple Dr");
        hashtable.put("Phone","765676567");

        System.out.println(hashtable.get("Name"));
        System.out.println(hashtable.get("Address"));
        System.out.println(hashtable.get("Phone"));

        for (String key:hashtable.keySet()){
            System.out.println(key + " : " + hashtable.get(key));
        }
        hashtable.replace("Name","Kevin");
        hashtable.remove("Phone");
        System.out.println(hashtable);

    }
}
