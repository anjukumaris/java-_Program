package simpleProgram.two;

public class StringOpration {
    public static void main(String[] args){
        String s1="Hello";
        String s2="hello";

        //Check if s1 and s2 are equal
//        if (s1.equals(s2)){
//            System.out.println("s1 equals s2");
//        }
//        else{
//            System.out.println("s1 not equals s2");
//        }
//    }
//     if (s1.equalsIgnoreCase(s2)){
//        System.out.println("s1 equals ignoring case s2");
//    }
//        else{
//        System.out.println("s1 not equals  ignoring case s2");
//    }
        //Convert uppercase and lowercase
        s1=s1.toUpperCase();
        System.out.println(s1+ "  is upper case string ");
         String s3=s1.toLowerCase();
        System.out.println(s3+ "  is Lower case string ");
        //length of a string
        System.out.println("Length of a string :::" +s1.length());
         String s4="HELLO world";
        // Check if s4 contains s1
        System.out.println("s4 cotains s1====" +s4.contains(s1));
        System.out.println("s4 cotains s1====" +s1.contains(s4));
        // Concatenate s1 and s2
        s1="Hello";
        s2="World";
        System.out.println(s1+""+s2);

}
}
