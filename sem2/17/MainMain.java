import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MainMain {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf =
                new RandomAccessFile("test.txt","rw");
//        FileInputStream fileInputStream =
//                new FileInputStream("test.txt");
//
//        FileChannel fileChannel =
//                fileInputStream.getChannel();

        FileChannel fileChannel =
                raf.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(26);

        int bytesCount = fileChannel.read(byteBuffer);

        while (bytesCount != -1){

            byteBuffer.flip();

            while (byteBuffer.hasRemaining()){
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();

            bytesCount = fileChannel.read(byteBuffer);
        }
        raf.close();
    }
}
