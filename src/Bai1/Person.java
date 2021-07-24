package Bai1;

import java.time.LocalDate;

public class Person {
    private String id, name;
    private LocalDate born;

    public Person() {
    }

    public Person(String id, String name, LocalDate born) {
        this.id = id;
        this.name = name;
        this.born = born;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
