public class Cat {
    private String color;
    private String breed;
    private String tailLength;

    public Cat(String color, String breed, String tailLength) {
        this.color = color;
        this.breed = breed;
        this.tailLength = tailLength;
    }

    public Cat(){
    }

    public Cat(String color){
        this.color = color;
    }

    public static Cat crossing(Cat cat1,Cat cat2){
        return new Cat(cat1.getColor(),cat2.getBreed(),
                cat1.getTailLength());
    }

    public Cat(String color,String breed){
        this(color);
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", tailLength='" + tailLength + '\'' +
                '}';
    }
}
