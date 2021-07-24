package Bai4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseHold {
    private ArrayList<Person> household =new ArrayList<>();
    private int member;
    private int no_house;

    public HouseHold() {
    }

    public HouseHold(int member, int no_house) {
        this.member = member;
        this.no_house = no_house;
        for (int i = 0; i < member; i++) {
            Person newPerson = new Person();
            household.add(setInforMember(newPerson));
        }
    }

    public ArrayList<Person> getHousehold() {
        return household;
    }

    public void setHousehold(ArrayList<Person> household) {
        this.household = household;
        this.member = household.size();
    }

    public int getMember() {
        return member;
    }

    public int getNo_house() {
        return no_house;
    }

    public void setNo_house(int no_house) {
        this.no_house = no_house;
    }

    @Override
    public String toString() {
        String resulf = "";
        for (int i = 0; i < member; i++) {
            resulf += household.get(i).toString();
        }
        return "HouseHold{" +
                "member=" + member +
                ", no_house=" + no_house +
                '}'+resulf;
    }

    public Person setInforMember(Person person) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("input name");
        String name = inputString.nextLine();
        System.out.println("input job");
        String job = inputString.nextLine();
        System.out.println("input born");
        LocalDate born = setDate();
        person.setName(name);
        person.setBorn(born);
        person.setJob(job);
        return person;
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
