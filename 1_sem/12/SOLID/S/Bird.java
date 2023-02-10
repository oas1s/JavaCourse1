package SOLID.S;

public class Bird {

    public String name;
    public String breed;
    public int age;

    public void sing(){
        System.out.println("shirik");
    }

    public static int parseInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.age = Bird.parseInt("12");
    }
}
