package ua.hillel.homework.lesson3;

public class PrintMonthInWord1 {
    public static void main(String[] args) {
        int month = 13;

        if (month == 1){
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        }  else if (month == 3) {
            System.out.println("MAR");
        }  else if (month == 4) {
            System.out.println("APR");
        }  else if (month == 5) {
            System.out.println("MAY");
        }  else if (month == 6) {
            System.out.println("JUN");
        }  else if (month == 7) {
            System.out.println("JUl");
        }  else if (month == 8) {
            System.out.println("AUG");
        }  else if (month == 9) {
            System.out.println("SEP");
        }  else if (month == 10) {
            System.out.println("OCT");
        }  else if (month == 11) {
            System.out.println("NOV");
        }  else if (month == 12) {
            System.out.println("DEC");
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}
