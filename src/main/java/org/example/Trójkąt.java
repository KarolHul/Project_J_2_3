package org.example;

public class Trójkąt {
    int a,h;

    public Trójkąt() {
        a=1;
        h=2;
    }

    public Trójkąt(int h) {
        this();
        this.h = h;
    }
    protected void obliczPole(){
        float result = (a*h)/2f;
        System.out.println(result);
    }
}
