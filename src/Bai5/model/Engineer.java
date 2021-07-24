package Bai5.model;

import java.time.LocalDate;

public class Engineer extends Cadres{
    private String majors;
    public Engineer(){

    }

    public Engineer(String name, LocalDate born, boolean sex, String address, String majors) {
        super(name, born, sex, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return super.toString()+"Engineer{" +
                "majors='" + majors + '\'' +
                '}';
    }
}
