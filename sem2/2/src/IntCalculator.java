public class IntCalculator<T extends Number>{
    public int sumValues(T first, T secound){
        return first.intValue() + secound.intValue();
    }
}
