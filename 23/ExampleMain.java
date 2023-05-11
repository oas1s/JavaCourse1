public class ExampleMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("hi");
    }

    static class MyThread extends Thread{

        public void run(){
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
            }
        }

    }
}
