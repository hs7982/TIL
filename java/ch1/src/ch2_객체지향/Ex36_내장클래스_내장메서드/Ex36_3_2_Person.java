package ch2_객체지향.Ex36_내장클래스_내장메서드;

public class Ex36_3_2_Person {
    private String name;
    private int age;

    public Ex36_3_2_Person() {}

    public Ex36_3_2_Person(int age) {
        this.age = age;
    }
    public Ex36_3_2_Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
