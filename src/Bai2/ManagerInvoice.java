package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerInvoice {
    public static List<Invoice> list = new ArrayList<>();

    public void add(Invoice invoice) {
        list.add(invoice);
    }

    public void addInvoices() {
        Scanner input = new Scanner(System.in);
        System.out.println("input n, n is number of new customer");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(inputInforCustomer());
        }
    }

    public void showAllInvoice() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).displayIfCustomer());
        }
    }

    public double caculatePayForCustomer(int codeMeter) {
        return searchByCodeMeter(codeMeter).caculateAmount();
    }

    public Invoice searchByCodeMeter(int codeMeter) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCustomer().getCodeMeter() == codeMeter)
                return list.get(i);
        }
        return null;
    }

    public void inputCustomers() {
        Scanner input = new Scanner(System.in);
        System.out.println("input number of Customer");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(inputInforCustomer());
        }
    }

    public Invoice inputInforCustomer() {

        String _name;
        int _no;
        int _codeMeter;
        int _oldIndex;
        int _newIndex;
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("input name of customer");
        _name = inputString.nextLine();
        System.out.println("input No of customer house");
        _no = inputNumber.nextInt();
        System.out.println("input code meter");
        _codeMeter = inputNumber.nextInt();
        System.out.println("input oldeIndex");
        _oldIndex = inputNumber.nextInt();
        System.out.println("input new Index");
        _newIndex = inputNumber.nextInt();
        Customer _customer = new Customer(_name, _no, _codeMeter);
        Invoice _invoice = new Invoice(_customer, _oldIndex, _newIndex);
        return _invoice;
    }
}
