import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            Scanner scanner = new Scanner(file);
            int index = 0;
            while (scanner.hasNextLine()) {
                index++;
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


