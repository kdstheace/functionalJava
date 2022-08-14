package com.functionalJava.section3;

public class LambdaExMain {
    public static void main(String ... args){
        // 1. Using Outer Class
        // MyRunnable runnable = new MyRunnable();
        // Thread th1 = new Thread(runnable);
        // th1.start();

        //2. Using Anonymous inner Class
        Thread th2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread Executed");
            }
        });
        th2.start();

        //3. Lambda  (Runnable Interface only have a single abstract method)
        //람다로 바꿀 수 있는 건 오직 추상 메소드가 하나만 있을 때 가능하다!!
        Thread th3 = new Thread(() -> System.out.println("Thread Executed with Lambda"));
        th3.start();

        new Thread(() -> System.out.println("hello Thread")).start();
    }

}
