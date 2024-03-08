package Lesson24_1_Abstract_Default_Static_methods_in_Interface;

public class Test1 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron); // compile time binding возьмет стороны из класса Figura
        f1.ploshad(); // runtime binding площадь возьмется из класса Kvadrat
    }
}

abstract class Figura {
    // Конструктор в абстрактном классе создать можно
//    Figura(int kolichestvoStoron){
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 0;
    abstract void perimetr();
    abstract void ploshad();
    void showInfo() {
        System.out.println("это фигура");
    }
}

class Kvadrat extends Figura {
//    Kvadrat(int kolichestvoStoron) {
//        super(kolichestvoStoron);                          // !!!!!!
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 4;
    int storona = 10;
    public void perimetr() {
        System.out.println("Перриметр: " + storona * kolichestvoStoron);
    }
    public void ploshad() {
        System.out.println("Площадь: " + storona * storona);
    }
}

class Pramougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr() {
        System.out.println("Перриметр: " + 2 * (storona1 + storona2));
    }
    public void ploshad() {
        System.out.println("Площадь: " + storona1 * storona2);
    }
}

class Okruzhnost extends Figura {
    int radius = 3;

    public void perimetr() {
        System.out.println("Перриметр: " + 2 * 3.14 + radius);
    }
    public void ploshad() {
        System.out.println("Площадь: " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura{
    void def() {
        System.out.println("Это четырехугольник");
    }
}