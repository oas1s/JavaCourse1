import java.io.File;
import java.io.RandomAccessFile;

public class RAFMain {
    public static void main(String[] args) throws Exception{
        RandomAccessFile randomAccessFile =
                new RandomAccessFile("test.txt","rw");
        randomAccessFile.seek(6);
//        System.out.println(randomAccessFile.getFilePointer());
//        System.out.println(randomAccessFile.readLine());
//        randomAccessFile.seek(4);
//        randomAccessFile.skipBytes(2);
//        System.out.println(randomAccessFile.readLine());
        randomAccessFile.writeBytes("user!");
        randomAccessFile.setLength(randomAccessFile.length()-1);
        randomAccessFile.close();
    }
}
