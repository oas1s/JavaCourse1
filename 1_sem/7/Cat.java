public class Cat {
    private String name;
    public int age;

    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("meow");
    }

    public String passport(){
        return "Name of cat: " + name + " age of cat: " + age;
    }

    public static void printPassport(Cat a) {
        System.out.println(a.passport());
    }
}
