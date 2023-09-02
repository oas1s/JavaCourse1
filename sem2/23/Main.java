public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunner());
        thread.start();
    }


    static class MyThread extends Thread{

        @Override
        public void run(){
            for (int i = 0; i < 400; i++) {
                System.out.println("This thread name is " +
                        Thread.currentThread().getName() + " counter is " + i);
            }
        }
    }

    static class MyRunner implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 400; i++) {
                System.out.println("This thread name is " +
                        Thread.currentThread().getName() + " counter is " + i);
            }
        }
    }

}
