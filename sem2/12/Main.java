import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream =
                new FileInputStream("test.txt");
        FileOutputStream fileOutputStream =
                new FileOutputStream("test.txt");

        String s = "Hello world";

        try {
            fileOutputStream.write(s.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);

        System.out.println(bytes);
        String s1 = new String(bytes);
        System.out.println(s1);
    }
}
