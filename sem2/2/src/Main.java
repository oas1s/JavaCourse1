public class Main {
    public static void main(String[] args) {
        IntCalculator<Double> intCalculator = new IntCalculator<>();
        System.out.println(intCalculator.sumValues(2.6,3.3));
        ValueCalculator calculator = new ValueCalculator();
        System.out.println(calculator.<Double,Integer>sumValues(2.2,2));
    }
}