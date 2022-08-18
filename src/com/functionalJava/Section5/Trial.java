package com.functionalJava.Section5;

public class Trial {
    public interface Wow{
        public void test();
        public String testStr();
    }
    @FunctionalInterface
    public interface Hello{
        public void test();
    }

    public class Inner2{
        public void test(){
            System.out.println("test");
        }
        private void test2(){}
        static void test3(){}

    }

    public static class StaticInner{
        private static void test3(){}

    }
    public void test(){

    }
}
