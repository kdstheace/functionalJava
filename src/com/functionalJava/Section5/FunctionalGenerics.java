package com.functionalJava.Section5;
@FunctionalInterface
public interface FunctionalGenerics<T, R> {
    R execute(T t);
}
