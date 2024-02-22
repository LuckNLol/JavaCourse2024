package Lesson13_Switch.HomeWork13;

public class Month {


    public static void daysQty(int month) {
        switch (month) {
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            default:
                System.out.println("Такого месяца не бывает");
        }

    }

    public static void main(String[] args) {
        daysQty(2);
        Month.daysQty(6);
        daysQty(5);
        daysQty(15);
    }

}
