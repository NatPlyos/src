package com.company.Purchase;

public class Test {
    public static void main(String[] args) {
        Purchase purchase0= new Purchase("Bread", 1, 1);
        Purchase purchase1= new Purchase("Butter", 2.3, 1);
        Purchase purchase2= new Purchase("Bear", 1.5, 2);
        Purchase purchase3= new Purchase("Cheese", 3.2, 2);
        Purchase[] shoppingSet= new Purchase[4];
        shoppingSet[0]=purchase0;
        shoppingSet[1]=purchase1;
        shoppingSet[2]=purchase2;
        shoppingSet[3]=purchase3;

        Cheque cheque=new Cheque(shoppingSet,true);
        double totalChequeAmount = cheque.calculateTotalAmount();
        System.out.printf("total сheque amount: %.2f", totalChequeAmount);
    }
}
