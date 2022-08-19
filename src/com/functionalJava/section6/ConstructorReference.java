package com.functionalJava.section6;

import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args) {
        Function<Runnable, Thread> threadGenerator = Thread::new;

        Runnable task1 = System.out::println;;
        Runnable task2 = () -> System.out.println("Task2 executed"); // 메서드 레퍼런스 못씀
        Runnable task3 = () -> System.out.println("Task3 executed"); //
        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);
        Thread thread3 = threadGenerator.apply(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        threadGenerator.apply(() -> System.out.println("Task4 executed")).start();
    }
}
    // Task2 executed
    // Task3 executed
    // Task4 executed