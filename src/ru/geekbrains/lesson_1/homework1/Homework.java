package ru.geekbrains.lesson_1.homework1;

public class Homework {

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

//
//    public static double someThink (double j, double f, double n, double i) {
//
////    public static double main (String[] args) {
////        double j, f, n, i;
//
//
//        j = 5.8;
//        f = 4.8;
//        n = 3.2;
//        i = 5.2;
//        return j * (f + (n / i));
//
//    }
//}



    public static boolean inInterval(int p, int r) {
        int p = 13;
        int r = 5;
        return (p + r) >= 10 && (p + r) <= 20;
    }
}

