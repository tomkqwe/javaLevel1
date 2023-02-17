package org.example.hw3.bankomat;

public class Bankomat {
    private int tens;
    private int twentys;
    private int fiftys;

    public Bankomat(int tens, int twentys, int fiftys) {
        this.tens = tens;
        this.twentys = twentys;
        this.fiftys = fiftys;
    }

    public int getTens() {
        return tens;
    }

    public void addTens(int tens) {
        this.tens += tens;
    }

    public int getTwentys() {
        return twentys;
    }

    public void addTwentys(int twentys) {
        this.twentys += twentys;
    }

    public int getFiftys() {
        return fiftys;
    }

    public void addFiftys(int fiftys) {
        this.fiftys += fiftys;
    }

    public boolean cashWithdrawal(int cash) {
        int tensSum = tens * 10;
        int twentysSum = twentys * 20;
        int fiftysSum = fiftys * 50;
        int sumAtBankomat = tensSum + twentysSum + fiftysSum;
        boolean condition = (sumAtBankomat - cash) >= 0;
        int fiftysCountBill = cash / 50;
        cash -= fiftysCountBill * 50;
        int twentysCountBill = cash / 20;
        cash -= twentysCountBill * 20;
        int tensCountBill = cash / 10;
        cash -= tensCountBill * 10;
        System.out.println("50: " + fiftysCountBill + " 20: " + twentysCountBill + " 10: " + tensCountBill);
        return condition && cash == 0;
    }
}
