import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        switch (str) {
            case "KFU":
                System.out.println("TOP UNIK");
                break;
            case "ITIS":
                System.out.println("TOP INSTITUT");
                break;
            case "INFA":
                System.out.println("TOP PREDMET");
                break;
        }
    }
}
