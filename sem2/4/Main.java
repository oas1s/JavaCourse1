import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
        Object
        Fruit
        Citrus
        Orange
     */
    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int size;
    }

    static class Orange extends Citrus {
        int color;
    }

    // ковариантность
    public static int sumList(List<? extends Fruit> oranges){
        int weightSum = 0;
        for (int i = 0; i < oranges.size(); i++) {
            weightSum += oranges.get(i).weight;
        }
        return weightSum;
    }

    // контрвариантность
    public static void add5Oranges(List<? super Orange> oranges){
        int weightSum = 0;
        for (int i = 0; i < 5; i++) {
            oranges.add(new Orange());
        }
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        List<Orange> oranges = new ArrayList<>();

        fruit = oranges.get(0);

        List<Citrus> citruses = new ArrayList<>();

        // инвариантность
        // citruses = oranges;

        sumList(citruses);

        List<Fruit> fruits = new ArrayList<>();

        sumList(fruits);

        add5Oranges(oranges);

        add5Oranges(citruses);

        add5Oranges(fruits);

    }
}
