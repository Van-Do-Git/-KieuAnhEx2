package Bai1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Room kind1 = new NomalRoom();
        Room kind2 = new VipRoom();
        Customer cus1 = new Customer("1", "VanDx", LocalDate.of(1991, 9, 23),
                kind1, LocalDate.of(2021, 6, 15), LocalDate.of(2021, 7, 15));
        Customer cus2 = new Customer("2", "HoaiNam", LocalDate.of(1992, 9, 24),
                kind2, LocalDate.of(2021, 6, 15), LocalDate.of(2021, 6, 30));
        Customer cus3 = new Customer("3", "HuyNam", LocalDate.of(1993, 9, 25),
                kind1, LocalDate.of(2021, 6, 15), LocalDate.of(2021, 8, 15));
        Hotel vanDx = new Hotel();
        vanDx.add(cus1);
        vanDx.add(cus2);
        vanDx.add(cus3);
        vanDx.showAllCustomer();
        System.out.println("Invoice of customer 2: "+vanDx.caculateMoney("2"));
        vanDx.addCustomers();
        vanDx.showAllCustomer();
    }
}
