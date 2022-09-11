package com.functionalJava.optionalPractice;

public class Kaka<T> {
    private T t;
    public Kaka(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
