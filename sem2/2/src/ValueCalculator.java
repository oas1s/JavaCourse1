public class ValueCalculator {
    public <T extends Number,S extends Integer> double sumValues(T t1, S t2){
        return t1.doubleValue() + t2.doubleValue();
    }
}
