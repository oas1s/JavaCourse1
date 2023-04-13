import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MemoryCardAdapter memoryCardAdapter =
                new MemoryCardAdapter(new MemoryCard());
        memoryCardAdapter.connectViaUsb();
    }
}
