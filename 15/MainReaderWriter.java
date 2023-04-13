import java.io.*;

public class MainReaderWriter {
    public static void main(String[] args) throws Exception{
//        OutputStreamWriter out
//                = new OutputStreamWriter(new FileOutputStream("test.txt"));
//        out.write("Hello world");
//        out.close();

        InputStreamReader in =
                new InputStreamReader(new FileInputStream("test.txt"));
        String s = "";
        int nextChar;
        while ((nextChar = in.read()) != -1) {
            s += (char) nextChar;
        }
        System.out.println(s);
        in.close();
    }
}
