package method;

public class MethodWrite {
    public static void main(String[] args) {

        MethodWrite obj=new MethodWrite();
        obj.hello("");
        obj.hello("",24);

    }

    public static void hello(String name) {
        System.out.println("Hello" + name);
    }

    public static void  hello(String name, int age) {
        System.out.println("Hello" + name);
        System.out.println("You are" + age);

    }
}

