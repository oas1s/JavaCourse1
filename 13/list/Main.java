package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        MyList myList = new MyList();
        for (int i = 0; i < 9; i++) {
            myList.add("sss");
        }
        myList.add("new String");
        System.out.println(myList.size());
    }
}
