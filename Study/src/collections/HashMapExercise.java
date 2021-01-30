package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("Name","Alex");
        map.put("Address","20 Maple Dr");
        map.put("Phone","765676567");
        // System.out.println(map1);

//        Map<String,String> map1=new HashMap<>();
//        map1.put("Name","Shawn");
//        map1.put("Address","50 drive dr");
//        map1.put("Phone","1589654723");
//       // System.out.println(map1);
////        ArrayList<Map<String,String>> table=new ArrayList<>();
////        table.add(map);
////        table.add(map1);
////        System.out.println(table);
//        System.out.println(map.get("Name"));
//        System.out.println(map.get("Address"));
//        System.out.println(map.get("Phone"));
//      //  System.out.println(map.keySet());
        for (String key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
//        for (String key:map1.keySet()){
//            System.out.println(key + " : " + map1.get(key));
//        }
       // map.replace("Name","Kevin");
        //map.remove("Phone");
        map.remove("phone",765676567);
        System.out.println(map);

    }
}
