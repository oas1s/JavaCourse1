import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test.txt") );
        dataOutputStream.writeUTF("Hello world");
        dataOutputStream.writeInt(1);
        dataOutputStream.close();

        DataInputStream inputStream = new DataInputStream(new FileInputStream("test.txt"));
        System.out.println(inputStream.readUTF());
        System.out.println(inputStream.readInt());
        inputStream.close();
    }
}
