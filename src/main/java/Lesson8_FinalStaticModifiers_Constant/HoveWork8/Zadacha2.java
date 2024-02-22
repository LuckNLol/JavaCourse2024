package Lesson8_FinalStaticModifiers_Constant.HoveWork8;

public class Zadacha2 {

    public static final double pi = 3.14;

// Методы
    public double ploshad(int radius) {
        double ploshadKruga = pi * radius * radius;
        System.out.println("Площадь круга: " + ploshadKruga);
        return ploshadKruga;
    }

    static double dlina(int radius2) {
        double dlinaKruga = 2 * pi * radius2;
        System.out.println("Длина куга: " + dlinaKruga);
        return dlinaKruga;
    }

     public void statistics(int radius3) {
         System.out.println();
         System.out.println("Радиус: " + radius3);
         System.out.println("Площадь круга: " + ploshad(radius3));
         System.out.println("Длина круга: " + dlina(radius3));
    }
}

class Zadacha2Test {
    public static void main(String[] args) {
        Zadacha2 stat = new Zadacha2();
        Zadacha2.dlina(3);
        stat.ploshad(4);
        stat.statistics(5);
    }
}
