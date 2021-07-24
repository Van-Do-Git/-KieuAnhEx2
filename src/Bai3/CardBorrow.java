package Bai3;

import java.time.LocalDate;

public class CardBorrow {
    private Student student;
    private LocalDate borrowDay;
    private int borrowTerm;
    private int codeBook;

    public CardBorrow() {
    }

    public CardBorrow(Student student, LocalDate borrowDay, int borrowTerm, int codeBook) {
        this.student = student;
        this.borrowDay = borrowDay;
        this.borrowTerm = borrowTerm;
        this.codeBook = codeBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(LocalDate borrowDay) {
        this.borrowDay = borrowDay;
    }

    public int getBorrowTerm() {
        return borrowTerm;
    }
    public LocalDate getDue(){
        return borrowDay.plusDays(borrowTerm);
    }

    public void setBorrowTerm(int borrowTerm) {
        this.borrowTerm = borrowTerm;
    }

    public int getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(int codeBook) {
        this.codeBook = codeBook;
    }

    @Override
    public String toString() {
        return student.toString() +
                "CardBorrow{" +
                "borrowDay=" + borrowDay +
                ", borrowTerm=" + borrowTerm +
                ", codeBook=" + codeBook +
                '}';
    }
}
