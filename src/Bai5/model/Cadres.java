package Bai5.model;

import java.time.LocalDate;

public class Cadres {
    private String name;
    private LocalDate born;
    private boolean sex;
    private String address;

    public Cadres() {
    }

    public Cadres(String name, LocalDate born, boolean sex, String address) {
        this.name = name;
        this.born = born;
        this.sex = sex;
        this.address = address;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
