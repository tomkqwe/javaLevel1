package org.example.hw3.bankomat;

public class BankomatRunner {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(2, 7, 4);
        bankomat.addTens(7);
        boolean b = bankomat.cashWithdrawal(170);
        System.out.println(b);
    }
}