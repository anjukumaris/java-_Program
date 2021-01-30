package method;

public class VariableLifeTime {
    public static void main(String args[]){
        int no=5;
        int result=myMethod(no);
        System.out.println("no:::::"+no);//no is 5 because main method variable declare scope is until its program ends
        System.out.println("Result::::"+result);//result is 10 because result variable stored in myMethod() ..
    }

    private static int myMethod(int no) {
        no=10;
        return no;
    }
}
