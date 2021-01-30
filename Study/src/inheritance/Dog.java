package inheritance;

public class Dog extends Animal {
    public Dog(String name) {

        super(name);
    }
    public void bark(){

        System.out.println(super.name + " barks");
    }
    public static void main(String[] args){
        Dog dog = new Dog("Dog");
        dog.eats();
        dog.sleep();
        dog.bark();
    }
}
