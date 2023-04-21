import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main2 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf =
                new RandomAccessFile("test.txt","rw");

        ByteBuffer byteBuffer = ByteBuffer.allocate(26);

        for (int i = 0; i < 26; i++) {
            byteBuffer.put((byte) ('A' +i));
        }
        byteBuffer.flip();

        FileChannel fileChannel =  raf.getChannel();

        fileChannel.write(byteBuffer);


    }
}
