package Lesson24_1_Abstract_Default_Static_methods_in_Interface;


/* Предположим Учитель и водитель должны оказывать еще первую помощь и тушить пожар,
 * а водитель еще должен уметь плавать. Добавлять в Employee эти методы неправильно
 * т.к. они унаследуются и Доктором и Водителем. Нужен Interface. В этом случае класс
 * наследует абстрактные методы интерфейса и должен либо перезаписать эти методы либо быть
 * тоже абстрактным.
 * Все методы в интерфейсе по умолчанию public abstract */

public class Test2_interface {
    public static void main(String[] args) {
        //Help_able h = new Help_able() {} // НЕЛЬЗЯ!!! Интерфейс это не объект
        Help_able h = new Driver(); // Можно интерфейс ссылается на объект
        Swim_able s = new Driver(); // is-a relationship
        Employee  e  = new Driver();
        System.out.println(s.a);
        s.swim();
        h.pomosh("Бинт");
        h.tushitPozhar();

    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher extends Employee implements Help_able {
    int studentsQty;

    void teach() {
        System.out.println("Учит");
    }

    @Override
    public void pomosh(String o) {
        System.out.println("Учитель оказывает помощь" + o);
    }

    @Override
    public void tushitPozhar(String...s) {
        System.out.println("Учитель тушит пожар" + s);
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String carName;

    void drive() {
        System.out.println("Водит авто");
    }

    @Override
    public void pomosh(String o) {
        System.out.println("Водитель оказывает помощь" + o);
    }

    @Override
    public void tushitPozhar(String...s) {
        System.out.println("Водитель тушит пожар" + s);
    }

    @Override
    public void swim() {
        System.out.println("Водитель плавает");
    }
}

interface Help_able {
    void pomosh(String predmet);

    void tushitPozhar(String...predmet); // могу перечислить чем тушим

}

interface Swim_able {
    void swim();
    int a = 10; // по умолчанию это public final static примитивная переменная
}