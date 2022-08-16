package com.functionalJava.sectionEtc;

import java.util.function.Consumer;

public class Person {
    public enum Gender{
        MALE, FEMALE
    }
    private Gender gender;
    private int age;

    private Person(Builder builder){
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "gender=" + gender + ", age=" + age + '}';
    }

    public static class Builder{
        public Gender gender;
        public int age;

        public Builder(){}

        public Builder with(Consumer<Builder> consumer){
            consumer.accept(this);
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
