package ua.hillel.classwork.lesson2;

import java.math.BigDecimal;

public class lesson2 {
    public class Lesson2 {
        public static void main(String[] args) {
            // Primitive types
            byte b;
            b = 127;
            System.out.println(++b);

            float f = 0.1F;
            double d = 0.5;

            char c = 'c';
            char c1 = 85;
            System.out.println(c1);
            System.out.println(c);

            double d1 = 0.235;
            double d2 = 0.2;

            double d3 = d2 / d1;
            BigDecimal n = new BigDecimal(d3);
            System.out.println(n);

            Double doub = d1;
            double newD = doub;

            String s = "42";
            int i = Integer.parseInt(s);

            System.out.println(s);

            // Operators

            int i1 = 10;
            i1 += 5;

            System.out.println(i1);

            int a = 10;
            System.out.println(a++);
            System.out.println(++a);
        }
    }
}
