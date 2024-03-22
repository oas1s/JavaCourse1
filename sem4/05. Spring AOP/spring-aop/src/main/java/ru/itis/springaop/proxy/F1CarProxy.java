package ru.itis.springaop.proxy;

import lombok.Getter;

public class F1CarProxy extends F1Car{

    @Getter
    private Before before;

    @Getter
    private After after;

    private F1Car f1Car;


    public F1CarProxy(F1Car f1Car) {
        this.f1Car = f1Car;
    }

    @Override
    public void startRace() {
        if (before != null){
            before.executeBefore();
        }
        f1Car.startRace();
        if (after != null){
            after.executeAfter();
        }
    }

    public void setBefore(Before before) {
        this.before = before;
    }

    public void setAfter(After after) {
        this.after = after;
    }
}
