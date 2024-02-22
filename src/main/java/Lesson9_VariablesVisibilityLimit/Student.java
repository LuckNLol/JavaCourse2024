package Lesson9_VariablesVisibilityLimit;

public class Student {

    int a = 10;
    int b = this.a;
    public static int c = 5;
    public int z = this.c;
    static int f = c;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(); // Объекту выделяется память (жизнь объекта начинается)
        st1 = null; // Удаляется адрес объекта (жизнь объекта заканчивается)
        st1 = new Student(); // Перезаписывается адрес, связь с прошлыми данными теряется, появляется новая связь (жизнь старого объекта закончена)

        Student st2 = new Student(); // Когда scope (область видимости) переменной заканчивается данные теряются, объект перестает существовать

        Student st3; // Объект не создается, т.к. нет обращения к конструктору (= new Student())
    }
}
