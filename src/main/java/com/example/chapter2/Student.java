package com.example.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * 当构造器可选参数过多时，使用builder
 */
public class Student {
    private final String name;
    private final String id;
    private final int age;
    private final String address;
    private final Set<String> hobbies;

    private Student(Builder builder) {
        name = builder.name;
        id = builder.id;
        age = builder.age;
        address = builder.address;
        hobbies = builder.hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public static class Builder {
        // required parameters
        private final String name;
        private final String id;

        // optional parameters
        private int age = 0;
        private String address = "";
        private Set<String> hobbies = new HashSet<>();

        public Builder(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder hobbies(Set<String> hobbies) {
            this.hobbies = hobbies;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student lucy = new Builder("lucy", "id")
                .address("address")
                .age(33)
                .build();
        System.out.println(lucy.toString());
    }
}
