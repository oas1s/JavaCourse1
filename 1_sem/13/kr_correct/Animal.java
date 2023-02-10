package kr_correct;

/*
Принцип SOLID L
 */
public class Animal {

    void eat(){
        System.out.println("animal is eating");
    }

    public static void main(String[] args) {
        Animal animal = new Bear();
        animal.eat();
        Animal animal1 = new Squirell();
        animal1.eat();
    }
}

class Bear extends Animal{

}
class Squirell extends Animal{
    void eat(){
        System.out.println("Im eating");
    }
}
