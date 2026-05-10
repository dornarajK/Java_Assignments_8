package org.example.Lambda_8_3;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d, city='%s'}", name, age, city);
    }
}