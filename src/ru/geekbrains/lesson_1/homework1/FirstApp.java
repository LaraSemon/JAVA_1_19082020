package ru.geekbrains.lesson_1.homework1;

import sun.awt.geom.AreaOp;

public class FirstApp {

    public static void main(String[] args) {
        byte a;
        a = 20;
        System.out.println("a = " + a);
        float b;
        b = a / 2.25f;
        System.out.println("b = a / 2.25 = " + b);
        short c = 5;
        int d;
        d = a + c;
        char e = 21;
        System.out.println("d = a + c = " + d + e);
        long g = 781010L;
        double h = g / 2.5;
        if ((g > 0) && (g != 0)) {
            System.out.println("g положительно");
        }
    }

//    public static int calculate (int k, int l, int m, int n) {
//        k = l = m = n = 6;
//        return (k * (l + (m / n)));
//    }
}
