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
    // @Override
    // public boolean equals(Object obj){
    //     if(! (obj instanceof Kaka)){
    //         return false;
    //     }else{
    //         return ((Kaka)obj).getT() == this.t;
    //     }
    // }

    @Override
    public boolean equals(Object obj) {
        System.out.println("ohoh");
        return ((Kaka)obj).getT() == this.t;
    }

    @Override
    public String toString() {
        return t.toString();
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
