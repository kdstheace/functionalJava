package com.functionalJava.Section5;

import com.functionalJava.Section5.Trial.Hello;
import com.functionalJava.Section5.Trial.Inner2;
import com.functionalJava.Section5.Trial.StaticInner;
import com.functionalJava.Section5.Trial.Wow;

public class Main {
    Hello hello = new Hello(){
        public void test(){
            System.out.println("wow");
        }
    };

    Inner2 inner = new Trial().new Inner2();
    StaticInner si = new StaticInner();
    StaticInner si2 = new Trial.StaticInner();



}
