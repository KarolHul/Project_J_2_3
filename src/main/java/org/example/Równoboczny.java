package org.example;

public class Równoboczny extends Trójkąt{
    public Równoboczny(int a) {
        this.a = a;
        h=0;
    }


    protected void obliczPole() {
        double result = (Math.pow(a,2)*Math.sqrt(3))/4;
        System.out.println(result);
    }
}
