package Bai3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libary {
    public static List<CardBorrow> list = new ArrayList<>();

    public void showAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void add(CardBorrow card) {
        list.add(card);
    }

    public void showAllDue(LocalDate date) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDue().equals(date)||list.get(i).getDue().isAfter(date)) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public CardBorrow inputInfoStudent() {
        String name;
        int costStudent;
        LocalDate born;
        String room;
        LocalDate borrowDay;
        int borrowTerm;
        int codeBook;
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("input name");
        name = inputString.nextLine();
        System.out.println("input costStudent");
        costStudent = inputNumber.nextInt();
        System.out.println("input room");
        room = inputString.nextLine();
        System.out.println("input borrow Term");
        borrowTerm = inputNumber.nextInt();
        System.out.println("input codeBook");
        codeBook = inputNumber.nextInt();
        System.out.println("input borm");
        born = setDate();
        System.out.println("input borrowDay");
        borrowDay = setDate();
        Student student = new Student(name, costStudent, born, room);
        CardBorrow newCard = new CardBorrow(student, borrowDay, borrowTerm, codeBook);
        return newCard;
    }

    public LocalDate setDate() {
        Scanner input = new Scanner(System.in);
        int year;
        int month;
        int day;
        System.out.println("input year");
        year = input.nextInt();
        System.out.println("input month");
        month = input.nextInt();
        System.out.println("input day");
        day = input.nextInt();
        return LocalDate.of(year, month, day);
    }
}
