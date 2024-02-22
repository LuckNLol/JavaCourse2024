package Lesson8_FinalStaticModifiers_Constant;

public class StaticNonStatic {
// Создаем instance переменные со значениме static для переменной count
    int a; // 1. Новая переменная
    String name; // по дефолту: null
    int course; // по дефолту: 0
    static int count; /* по дефолту: 0. Эта переменная Class variable (принадлежит всему классу)
                  добавив к ней модификатор "static" ее значение можно изменить в других классах  */


// При появлении нового студена count увеличивается на 1
    public StaticNonStatic(String name2, int course2) {
        count++; // данным способом не увеличить на 1 последующие значения, каждый раз все начнается 0+1
        name = name2;
        course = course2;
        System.out.println("Студент № " + count + " создан");
    }

// Добавление в методе значения static
    public static void showCount() {
        System.out.println("Всего создано студенотов: " + count);
    }
// 2. Добавляем метод
    public void showInfo() {
        System.out.println("Добро пожаловать в класс!");
    }
// 3. Добавляем нестатичный метод
    void abc() {
        a++; // В нестатичном методе использована нестатичная переменная "a"
        count++; // Метод может увеличить на 1 статичную переменную "count"
    }
// 4. Добавляем статичный метод
    static void bcd() {
        count++; // "count" существует независимо, поэтому может быть вызван
        //a++; // ОШИБКА: объекта a++ еще нет, но мы хотим его испльзовать в методе. Как использовать?
        StaticNonStatic sns = new StaticNonStatic("Глеб", 5);
        sns.a++; // Создать объект, вызвать переменную, увеличить на 1

    }

    public static void main(String[] args) {
        StaticNonStatic sns1 = new StaticNonStatic("Ivan", 3);
        sns1.abc(); // Метод принадлежит конкретному объекту

        bcd(); // Метод принадлежит статичному Классу
    }
}
