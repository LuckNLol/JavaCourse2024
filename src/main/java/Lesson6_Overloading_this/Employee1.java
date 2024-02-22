package Lesson6_Overloading_this;

// Как улучшить конструктор в классе Employee??
/*
* 1. Написать тело для Конструтора у которого больше всего параметров (5);
* 2. В следующий по размеру конструтор (3 параметра) вызвать конструтор с 5 параметрами
*    и 2 оставшихся параметра заполнить дефолтными значениями для double - 0.0, для String - null;
* 3. В Конструтор размерностью 2 параметра подставляем конструтор размерностью 3 параметра и оставшиеся
*    значения дописываем как в п.2
*/

public class Employee1 {
 // 3 Определить часть параметров Конструктора для работников предприятия
// 4 Как не переписывать одинаковый код внутри конструктора?
// 4.1 Вызвать конструктор с определенными значениями
    Employee1 (int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);

    }

    // 3.1 Определить параметры Конструктора для новых сотрудников (нет id, но известен возраст и фамилия)
    Employee1 (String surname3, int age3) {
        this(0, surname3, age3,  0.0, null);

    }

    // 3.2 Определить параметры Конструктора для новых сотрудников (нет id, но известен возраст и фамилия)
    Employee1 (int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    // 1 Обозначить переменные
    int id;
    String surname;
    int age;
    double salary;
    String department;

}

/* 1 Создать Объект, на основании контсруктора, дефолтный Конструктор заменить на свои */
class EmployeeTest1 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(12, "Иванович", 38); // 3
        System.out.println(emp1.surname);

        Employee1 emp2 = new Employee1("Петров", 34); // 3.1
        System.out.println(emp2.surname);

        Employee1 emp3 = new Employee1(123, "Сидоров", 25, 150_000, "IT"); // 3.2
        System.out.println(emp3.surname + " " + emp3.department);
    }
}
