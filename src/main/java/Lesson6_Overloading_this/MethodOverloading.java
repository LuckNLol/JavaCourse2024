package Lesson6_Overloading_this;

/* Вывод печати в одном классе, создание объекта и его инициализация в другом  */
public class MethodOverloading {

// создадим метод, которые ничего не выводит
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }

    void show(String s, int a) {
        System.out.println("String: " + s + "int: " + a);
    }

    void show(Double s, String a) {
        System.out.println(s + a);
    }

    void show(int a, String s) {
        System.out.println("{Хороший день}" );
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {

/* Создать Объект класса  MethodOverloading, с дефолтным конструктором без параметров и внутри объекта
* вызвать метод showInt(), и передать в него аргумент   */
    MethodOverloading method = new MethodOverloading();
    int a = 500;
    method.show(a);

    boolean b = true;
    method.show(b);

    String s = "Hello!";
    method.show(s);

    method.show("GoogDay, ", 5);
    method.show(9.5, " Недель");
    method.show(1, "строка");


    //25минут курса.

    }
}
