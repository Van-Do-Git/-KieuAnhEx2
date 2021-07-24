package Bai4;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        town.addHouseHolds();
        for (int i = 0; i <Town.list.size(); i++) {
            for (int j = 0; j <Town.list.get(i).getMember(); j++) {
                Person thisMember = Town.list.get(i).getHousehold().get(j);
                if (thisMember.getBorn().plusYears(80).isAfter(LocalDate.now()));
                System.out.println(Town.list.get(i));
                break;
            }
        }
    }
}
