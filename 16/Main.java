import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedOutputStream buff =
                new BufferedOutputStream(new FileOutputStream("text.txt"),3);
        buff.write("hiii!".getBytes());
        buff.close();

        BufferedInputStream in =
                new BufferedInputStream(new FileInputStream("text.txt"));
        System.out.println(new String(in.readAllBytes()));


        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("text.txt"),3);

        bufferedWriter.write("asd");
        bufferedWriter.flush();
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("text.txt"));

        System.out.println(bufferedReader.readLine());
    }
}
