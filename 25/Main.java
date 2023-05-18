import lombok.SneakyThrows;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.setName("one");
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println(Resource.i);
    }

    static class MyThread extends Thread {

        @Override
        public void run(){
            new Resource().incrementI();
            Resource.incrementStaticI();
        }
    }

    static class Resource {

        static Integer i = 5;

        @SneakyThrows
        public static void incrementStaticI(){
            synchronized (Resource.class){
                int j = i;
                j++;
                i = j;
            }
        }


        @SneakyThrows
        public void incrementI(){
            synchronized (this){
                int j = i;
                j++;
                i = j;
            }
        }

    }
}
