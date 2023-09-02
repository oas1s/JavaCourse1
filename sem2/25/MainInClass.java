
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainInClass {
    public static void main(String[] args) throws Exception {
        SymbolPrinter symbolPrinter = new SymbolPrinter("something");
        MyThread[] myThreads = new MyThread[symbolPrinter.stringToPrint.length()];
        for (int i = 0; i < symbolPrinter.stringToPrint.length(); i++) {
            myThreads[i] = new MyThread(symbolPrinter);
            myThreads[i].start();
            myThreads[i].join();
        }
    }


    static class MyThread extends Thread{

        private SymbolPrinter symbolPrinter;

        public MyThread(SymbolPrinter symbolPrinter) {
            this.symbolPrinter = symbolPrinter;
        }

        public void run(){
            symbolPrinter.printSymbol();
        }
    }


    static class SymbolPrinter{
        private String stringToPrint;
        private int counter = 0;

        public SymbolPrinter(String stringToPrint) {
            this.stringToPrint = stringToPrint;
        }

        public synchronized void printSymbol(){
            char c = stringToPrint.charAt(counter);
            counter++;
            System.out.println(c);
            System.out.println(c);
        }
    }
}
