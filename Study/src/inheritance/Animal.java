package inheritance;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eats(){
        System.out.println(name + " eats");
    }
    protected void sleep(){
        System.out.println(name + " sleeps");
    }
}
