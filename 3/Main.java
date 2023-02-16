import java.util.ArrayList;
import java.util.List;

public class Main {

   private class Cat {

   }

   public static void main(String[] args) {

       List<String> strings = new ArrayList<>();
       List<Integer> numbers = new ArrayList<>();
       List<Cat> cats = new ArrayList<>();


       System.out.println(strings.getClass() == numbers.getClass());
       System.out.println(numbers.getClass() == cats.getClass());

   }
}