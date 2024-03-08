package Lesson23_Overriding_Hiding_Final;

public class Test4 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
        //emp.sleep(); // не увижу метод, т.к. он private
        t.sleep();
        Employee2 e = new Teacher2();
        //e.sleep(); // метод sleep не унаследовался Teacher2 т.к. в Employee2 он является private

    }
}


class Eda2 {
}

class Fruits2 extends Eda2 {
}


class Employee2 {
    double salary = 100;
    String name = "Leonid";

    public Eda2 eat() {  // Супер класс
        System.out.println("Кушает работник");
        Eda2 e = new Eda2();
        return e;
    }

    private void sleep() {
        System.out.println("Спит работник");
    }
}

class Teacher2 extends Employee2 {
    int studentsQty;

    @Override
    public Eda2 eat() {
        System.out.println("Кушает учитель");
        Fruits2 f = new Fruits2();
        return f;
    }

    int kolichestvoUchenikov;

    void teach() {
        System.out.println("Учит");
    }

    //@Override // Статичный метод не перезаписывается
    static void sleep() {
        System.out.println("Спит учитель");
    }
}







