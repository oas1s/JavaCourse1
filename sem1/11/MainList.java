import forest.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
        list.remove(0);
        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());


        List<Tree> trees = new ArrayList<>();
        for (int i = 0; i <2; i++) {
            trees.add(new Tree());
        }

        for (int i = 0; i <2; i++) {
            trees.get(i).grow();
        }

    }
}
