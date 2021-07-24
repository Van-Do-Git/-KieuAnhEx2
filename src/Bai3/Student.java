package Bai3;

import java.time.LocalDate;

public class Student {
    private String name;
    private int codeStudent;
    private LocalDate born;
    private String room;

    public Student() {
    }

    public Student(String name, int codeStudent, LocalDate born, String room) {
        this.name = name;
        this.codeStudent = codeStudent;
        this.born = born;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", codeStudent=" + codeStudent +
                ", born=" + born +
                ", room='" + room + '\'' +
                '}';
    }
}
