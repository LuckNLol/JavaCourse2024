package Lesson25_Polimorphism_instanseof;

public class Test4_casting {
    public static void main(String[] args) {
        Employee em1 = new Doctor();  // Upcasting
        Employee em2 = new Teacher(); // Upcasting
        Employee em3= new Driver();   // Upcasting
        Helpable h = new Doctor();

// Проверяем каждый элемент массива, если находим Водителя, делаем Casting
        Employee em4 = new Employee();
        Employee [] array = {em1, em2, em3, em4};
        for(Employee e : array) {
            if(e instanceof Driver) {
                System.out.println(((Driver)e).carName);
                ((Driver)e).drive();
                System.out.println();
            }
        }

        Employee e = new Employee();
        System.out.println(e == em1);
        System.out.println();

// Кастинг. Вар.1:
        Doctor d1 = (Doctor) em1; // Теперь объект em1 ссылается на объект (Доктор) // DOWNcasting
        System.out.println(d1.specialization);
        d1.heel();
        System.out.println();

// Кастинг. Вар.2:
        System.out.println(((Doctor)em1).specialization);
        ((Doctor)em1).heel();  //DOWNcasting
        System.out.println();

        h.help();
        System.out.println(((Doctor)h).specialization);
        ((Doctor)h).heel();
        System.out.println();
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


class Doctor extends Employee implements Helpable {
    String specialization = "Xirurg";

    void heel() {
        System.out.println("Лечит");
    }

    @Override
    public void help() {
        System.out.println("Доктор оказывает помощь");
    }
}

class Teacher extends Employee {
    int studentsQty;

    void teach() {
        System.out.println("Учит");
    }
}

class Driver extends Employee {
    String carName = "Mersrsedes";

    void drive() {
        System.out.println("Водит авто");
    }
}

interface Helpable{
    void help();
}
