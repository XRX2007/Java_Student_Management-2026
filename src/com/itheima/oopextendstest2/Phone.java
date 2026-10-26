package com.itheima.oopextendstest2;

public class Phone extends Smartdevices{
    @Override
    public double sell(double price) {
        double payment=super.sell(price);
        payment=payment*0.9;
        return payment;
    }
}
