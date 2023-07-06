package ua.hillel.homework.lesson2;

public class lesson2 {
    public static void main(String[] args) {

        // Task 1

        int xc = 15;

        double kelvin = 0;
        kelvin = xc + 273.16;
        double zk = kelvin;

        double fahrenheit = 0;
        fahrenheit = (xc * 1.8 + 32);
        double yf = fahrenheit;

        System.out.println(xc);
        System.out.println(zk);
        System.out.println(yf);
        System.out.println("+++++++++++++++++++++++++");

        // Task

        int  a = 5;
        int  b = 8;
        float c = 0.5f;
        float area = c * a * b;
        System.out.println(area);
        System.out.println("+++++++++++++++++++++++++");



        // Task 3

        int r = 6;
        double p = 3.14;
        double square = p * Math.pow(r, 2);
        System.out.println(square);

    }
}
