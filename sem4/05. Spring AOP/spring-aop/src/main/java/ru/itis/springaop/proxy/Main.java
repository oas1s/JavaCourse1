package ru.itis.springaop.proxy;

public class Main {
    public static void main(String[] args) {
        F1Car f1Car = new F1Car();
        F1CarProxy f1CarProxy = new F1CarProxy(f1Car);
        f1CarProxy.setBefore(() -> System.out.println("executed before car race"));
        f1Car = f1CarProxy;
        f1Car.startRace();
    }
}
