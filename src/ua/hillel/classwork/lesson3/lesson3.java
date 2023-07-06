package ua.hillel.classwork.lesson3;

public class lesson3 {
    public static void main(String[] args) {

        System.out.println("Before If");
        boolean flag = true;
        String str = null;

        int day = 7;

        if(day == 1) {
            System.out.println("too hard");
        }
        else if (day == 3){
            System.out.println("working hard");
        }
        else if (day == 5){
            System.out.println("dayOff soon");
        }
        else {
            System.out.println("party hard");
        }

    }
}
