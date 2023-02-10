public class ValueCalculator {
    public <T extends Number,S extends Number> double sumValues(T t1, S t2){
        return t1.doubleValue() + t2.doubleValue();
    }
}
