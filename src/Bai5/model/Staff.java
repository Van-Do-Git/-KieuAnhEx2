package Bai5.model;

import java.time.LocalDate;

public class Staff extends Cadres{
    private String work;

    public Staff() {
    }

    public Staff(String name, LocalDate born, boolean sex, String address, String work) {
        super(name, born, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "work='" + work + '\'' +
                '}';
    }
}
