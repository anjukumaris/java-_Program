package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args){
        List<String> aList = new ArrayList<>();
        aList.add("Lee");
        aList.add("David");
        System.out.println(aList);
        aList.add(0,"Lilia");
        System.out.println(aList);
        System.out.println(aList.get(1));
        //ArrayList<BOOK>book =new ArrayList<BOOK>();
        //book.add()
//        for(int i=0;i<aList.size();i++){
//            System.out.println(aList.get(i));
//        }
        for (String name: aList){
            System.out.println(name);
        }
        System.out.println("Found : "+ aList.contains("Lila"));// particulR VALUE present in the list
        System.out.println("Before Sort : " + aList);
        Collections.sort(aList);// in this case sort is a static method so we  cant create object .. so directly call with refrence of class name//
        System.out.println("After Sort : "+aList);
        aList.set(0,"Meng");
        System.out.println("After change the vLUE:::"+aList);

        aList.remove("Lee");
        System.out.println("After removing::"+aList);
        aList.remove(0);
        System.out.println(aList);
    }
}
