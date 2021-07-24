package Bai3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Van", 1, LocalDate.of(1991, 9, 23), "A");
        Student st2 = new Student("Cuong", 2, LocalDate.of(1992, 9, 24), "B");
        Student st3 = new Student("Hanh", 3, LocalDate.of(1993, 9, 25), "C");
        CardBorrow card1 = new CardBorrow(st1, LocalDate.now(), 15, 100);
        CardBorrow card2 = new CardBorrow(st2, LocalDate.now(), 16, 101);
        CardBorrow card3 = new CardBorrow(st3, LocalDate.now(), 17, 102);
        Libary VanDx = new Libary();
        VanDx.add(card1);
        VanDx.add(card2);
        VanDx.add(card3);
        VanDx.showAllDue(LocalDate.of(2021, 7, 30));
    }
}
