package Bai4;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate born;
    private String job;

    public Person() {
    }

    public Person(String name, LocalDate born, String job) {
        this.name = name;
        this.born = born;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", job='" + job + '\'' +
                '}';
    }
}
