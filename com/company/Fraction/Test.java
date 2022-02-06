package com.company.Fraction;

public class Test {
    public static void main(String[] args) {
        Fraction fraction0=new Fraction(3,4);
        System.out.println(fraction0);
        Fraction fraction1=new Fraction(5,8);
        System.out.println(fraction1);
        Fraction sum= new Fraction();
        sum=sum.sumFractions(fraction1,fraction0);
        System.out.println(sum.toString());

    }
}
