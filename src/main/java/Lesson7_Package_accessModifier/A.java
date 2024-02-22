package Lesson7_Package_accessModifier;

import Lesson6_Overloading_this.Employee;

public class A {
    public static void main(String[] args) {

// Внутри класса А создан объект класса В
    B object = new B();

/* Вызов из класса А класс Employee из другого пакера (Package 6) приведет к ошибке, т.к. в Пакете с классом А
* нет сведений об Employee  */

        //Employee emp = new Employee(); // неправильно (!)

    //Lesson6_Overloading_this.Employee emp = new Lesson6_Overloading_this.Employee("Иванов", 23);
    /* Правильно!) Для этого в класс Employee должен обладать модификатором достуа "public" */
    }


}
