package Bai5.view;

import Bai5.controller.ManagerCadres;
import Bai5.model.Cadres;
import Bai5.model.Employee;
import Bai5.model.Engineer;
import Bai5.model.Staff;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadres cas1 = new Employee("Hanh", LocalDate.of(1998, 9, 15), true, "Dong Anh - Ha Noi", 0);
        Cadres cas2 = new Employee("Cuong", LocalDate.of(1998, 10, 10), true, "Hoang Mai - Ha Noi", 2);
        Cadres cas3 = new Engineer("Nam", LocalDate.of(1992, 5, 25), true, "Viet Tri - Phu Tho", "Electric");
        Cadres cas4 = new Engineer("Huy", LocalDate.of(1993, 4, 10), true, "Gia Binh - Bac Ninh", "Commerce");
        Cadres cas5 = new Staff("Binh", LocalDate.of(1995, 11, 15), true, "Kinh Mon - Hai Duong", "Clean");
        Cadres cas6 = new Staff("Than", LocalDate.of(1999, 1, 10), true, "Tu Liem - Ha Noi", "Security");
        ManagerCadres vanDx = new ManagerCadres();
        vanDx.addNewCadres(cas1);
        vanDx.addNewCadres(cas2);
        vanDx.addNewCadres(cas3);
        vanDx.addNewCadres(cas4);
        vanDx.addNewCadres(cas5);
        vanDx.addNewCadres(cas6);
        Scanner inputString = new Scanner(System.in);
        System.out.println("input name are you want to search");
        String name = inputString.nextLine();
        System.out.println(vanDx.findCadresByName(name));
        vanDx.showAll();
        vanDx.addNewCadres(inputInfoNewStaff());
        System.out.println("input name are you want to edit info");
        name = inputString.nextLine();
        int indexEdit = vanDx.findCadresByName(name);
//        vanDx.editInforCadres(indexEdit, inputInfoNewCadres());
        vanDx.showAll();
    }

    public static Cadres inputInfoNewStaff(){
        Staff newStaff = (Staff) inputBasicsInfo();
        return newStaff;
    }

    public static Cadres inputBasicsInfo() {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        String name;
        LocalDate born;
        boolean sex;
        String address;
        System.out.println("input name");
        name = inputString.nextLine();
        System.out.println("input born");
        born = setDate();
        System.out.println("if Male input 1 ,else input 2 ");
        int chooseSex = inputNumber.nextInt();
        if (chooseSex == 1)
            sex = true;
        else
            sex = false;
        System.out.println("input address");
        address = inputString.nextLine();
        return new Cadres(name, born, sex, address);
    }

    public static LocalDate setDate() {
        Scanner inputString = new Scanner(System.in);
        int year;
        int month;
        int day;
        System.out.println("input year");
        year = inputString.nextInt();
        System.out.println("input month");
        month = inputString.nextInt();
        System.out.println("input day");
        day = inputString.nextInt();
        return LocalDate.of(year, month, day);
    }
}
