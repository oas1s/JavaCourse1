import lombok.SneakyThrows;

public class MainDeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread1 myThread1 = new MyThread1(resourceA);
        MyThread2 myThread2 = new MyThread2(resourceB);
        myThread1.start();
        myThread2.start();
    }
}



class MyThread1 extends Thread{
    ResourceA resourceA;

    public MyThread1(ResourceA resourceA) {
        this.resourceA = resourceA;
    }

    public void run(){
        System.out.println(resourceA.getI());
    }
}

class MyThread2 extends Thread{
    ResourceB resourceB;

    public MyThread2(ResourceB resourceB) {
        this.resourceB = resourceB;
    }

    public void run(){
        System.out.println(resourceB.getI());
    }
}

class ResourceA{
    ResourceB resourceB;

    @SneakyThrows
    public synchronized int getI(){
        return resourceB.returnI();
    }

    public synchronized int returnI(){
        return 1;
    }
}

class ResourceB{
    ResourceA resourceA;

    public synchronized int getI(){
        return resourceA.returnI();
    }

    public synchronized int returnI(){
        return 2;
    }
}
