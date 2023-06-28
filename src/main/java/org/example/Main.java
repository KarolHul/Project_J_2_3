package org.example;

public class Main {
    public static void main(String[] args) {
        Trójkąt trójkąt = new Trójkąt();
        Trójkąt trójkąt1 = new Trójkąt(5);
        Równoboczny równoboczny = new Równoboczny(2);
        trójkąt.obliczPole();
        trójkąt1.obliczPole();
        równoboczny.obliczPole();

    }
}