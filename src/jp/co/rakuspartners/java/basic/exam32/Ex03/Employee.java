package jp.co.rakuspartners.java.basic.exam32.Ex03;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return name;
    }

}
