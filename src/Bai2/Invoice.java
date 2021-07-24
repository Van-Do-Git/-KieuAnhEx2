package Bai2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Invoice {
    private Customer customer;
    private int oldIndex;
    private int newIndex;
    public final double UNIT_PRIME = 2500;

    public Invoice() {
    }

    public Invoice(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getUNIT_PRIME() {
        return UNIT_PRIME;
    }

    public double caculateAmount() {
        return (newIndex - oldIndex) * UNIT_PRIME;
    }

    public String displayIfCustomer() {
        return customer.toString() +
                " Old Index: " + oldIndex +
                " New Index: " + newIndex;
    }
}

