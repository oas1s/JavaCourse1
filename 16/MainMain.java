import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine();
        String file = "/Users/moncou/Desktop/JavaCourse1/16/kisspng-bmp-file-format-digital-image-5b0f6ce7849257.362256491527737575543.jpg";
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);

        String name = getFolder(file).get(1);
        String folder = getFolder(file).get(0);

        FileOutputStream fileOutputStream =
                new FileOutputStream(folder+name+format);
        fileOutputStream.write(bytes);
        fileInputStream.close();
    }

    public static List<String> getFolder(String file){
        String[] strings = file.split("\\/");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <strings.length-1 ; i++) {
            stringBuilder.append(strings[i] + "/");
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        String[] strings1 = strings[strings.length-1].split("\\.");
        for (int i = 0; i < strings1.length-1; i++) {
            stringBuilder1.append(strings1[i] + ".");
        }
        return List.of(stringBuilder.toString(),stringBuilder1.toString());
    }
}
