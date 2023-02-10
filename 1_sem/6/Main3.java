import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str) {
            case "str11":
                System.out.println(11);
                break;
            case "str22":
                System.out.println(22);
                break;
            case "str33":
                System.out.println(33);
                break;
            default:
                System.out.println(505);
                break;
        }
    }
}
