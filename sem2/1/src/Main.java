import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        System.out.println(integer);
        Double d1 = new Double(2.33);
        System.out.println(d1);
        Boolean b = new Boolean(true);
        System.out.println(b);
        String s = "11111";
        Integer i2 = Integer.parseInt(s);
        System.out.println(i2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer a = new Integer(0);
        Integer b1 = new Integer(0);

        b1=a;
        a=1;
        System.out.println(b1);

        Integer i3 = 4;
        int i4 = new Integer(1);
        printNum(new Integer(3));
        Integer[] ints = new Integer[1];
        ints[0] = 1;
//        printArr(ints);
//        Scanner scanner = new Scanner(new File("some.csv"));
//        scanner.nextLine();
    }

    public static void printNum(int a){
        System.out.println(a);
    }

    public static void printArr(int[] arr){
        System.out.println(arr[0]);
    }
}