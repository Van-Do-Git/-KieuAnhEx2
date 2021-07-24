package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Town {
    public static List<HouseHold> list = new ArrayList<>();

    public void add(HouseHold houseHold) {
        list.add(houseHold);
    }

    public void showAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void addHouseHolds() {
        Scanner input = new Scanner(System.in);
        System.out.println("input number of households of town");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("input number of member");
            int member = input.nextInt();
            System.out.println("input no_house");
            int no_house = input.nextInt();
            HouseHold newHouseHold = new HouseHold(member, no_house);
            list.add(newHouseHold);
        }
    }

}
