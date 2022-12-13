package files;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter =
                new FileWriter("file.txt");
        fileWriter.write("some String \n");
        fileWriter.write("something");
        fileWriter.close();
    }
}
