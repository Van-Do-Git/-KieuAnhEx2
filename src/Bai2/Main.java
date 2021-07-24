package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("van", 12, 1);
        Customer customer2 = new Customer("van", 14, 2);
        Customer customer3 = new Customer("van", 15, 3);
        Invoice invoice1 = new Invoice(customer1, 1, 20);
        Invoice invoice2 = new Invoice(customer2, 1, 25);
        Invoice invoice3 = new Invoice(customer3, 1, 28);
        ManagerInvoice VanDx = new ManagerInvoice();
        VanDx.add(invoice1);
        VanDx.add(invoice2);
        VanDx.add(invoice3);
        VanDx.addInvoices();
        System.out.println(VanDx.caculatePayForCustomer(2));
        VanDx.showAllInvoice();
    }
}
