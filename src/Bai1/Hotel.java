package Bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private Room kind1 = new NomalRoom();
    private Room kind2 = new VipRoom();
    public static List<Customer> list = new ArrayList<>();

    public void add() {
        list.add(inputInformation());
    }

    public void add(Customer newCustomer) {
        list.add(newCustomer);
    }

    public String showCustomer(String id) {
        int index = searchCustomer(id);
        if (index != -1) {
            return list.get(index).toString();
        } else
            return "Not found";
    }

    public void delete(String id) {
        int index = searchCustomer(id);
        if (index != -1) {
            list.remove(index);
            System.out.println("Delete complete");
        } else
            System.out.println("Not found");
    }

    public int searchCustomer(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Customer inputInformation() {
        Scanner input = new Scanner(System.in);
        Customer newCustomer = new Customer();
        System.out.println("input name");
        newCustomer.setName(input.nextLine());
        System.out.println("input id");
        newCustomer.setId(input.nextLine());
        System.out.println("input kind room: " +
                "nomal input 1" +
                "vip input 2");
        int kind = input.nextInt();
        if(kind==1){
            newCustomer.setKindRoom(kind1);
        }else
            newCustomer.setKindRoom(kind2);
        System.out.println("input born");
        newCustomer.setBorn(setDate());
        System.out.println("input checkin");
        newCustomer.setCheckIn(setDate());
        System.out.println("input checkout");
        newCustomer.setCheckOut(setDate());
        return newCustomer;
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

    public void addCustomers() {
        Scanner input = new Scanner(System.in);
        System.out.println("input quantity of customers to add");
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            Customer newCustomer = inputInformation();
            list.add(newCustomer);
        }
    }

    public void showAllCustomer() {
        for (Customer customer : list) {
            System.out.println(customer.toString());
        }
    }

    public double caculateMoney(String id) {
        int index = searchCustomer(id);
        return list.get(index).caculateAmount();
    }
}
