package com.company.Fraction;

public class Fraction {
    private int numerator; //числитель
    private int denominator; //знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Input error. Denominator cannot be 0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fraction() {
        this(1, 1);
    }

    //fraction output to console (toString modified)
    public String toString() {
        if (denominator == 0) {
            return "Input error. Denominator cannot be 0";
        } else {
            return numerator + "/" + denominator;
        }
    }

    //method of adding two fractions
    //нужно привести дроби к общему знаменателю (наименьшему общему кратному). Для нахождения НОК, нужно найти наибольший общий делитель (НОД)
    //НОК И НОД записаны в отдельные методы
    public Fraction sumFractions(Fraction f1, Fraction f2) {
        Fraction result = new Fraction();
        //if the same denominators
        if (f1.denominator == f2.denominator) {
            result.denominator = f1.denominator;
            result.numerator = f1.numerator + f2.numerator;
        } else {
            //if different denominators
            int nok = nok(f1.denominator, f2.denominator);
            result.denominator = nok;
            result.numerator = f1.numerator * (nok / f1.denominator) + f2.numerator * (nok / f2.denominator);
        }
        return result;
    }


    private int nod(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}







