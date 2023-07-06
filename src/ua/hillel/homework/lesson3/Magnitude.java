package ua.hillel.homework.lesson3;

public class Magnitude {
    public static void main(String[] args) {
        int a = 10;
        int b = -9;
        if (Math.abs(a) > Math.abs(b)){
            System.out.println(a + " " + "bigger then" + " " + b);
        }
        else {
            System.out.println(b + " " + "bigger then" + " " + a);
        }
    }
}
