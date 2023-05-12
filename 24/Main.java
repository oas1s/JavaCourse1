public class Main {
    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread("tape");
        System.out.println(thread.getState());
        Thread.sleep(3000);
        MyThread myThread = new MyThread("something");
        System.out.println(myThread.getState());


        thread.start();
        thread.join();
        myThread.start();
        myThread.join();

        System.out.println(thread.getState());
        System.out.println(myThread.getState());

    }

    static class MyThread extends Thread{

        private String name;

        public MyThread(String name) {
            super();
            this.name = name;
        }


        public void run(){
            System.out.println(this.getState());
            System.out.println(this.name);
        }
    }
}
