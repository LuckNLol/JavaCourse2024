package Lesson10_Import_importStatic_comments;

// можно импортировать пакет и нужный класс
//import Lesson9_VariablesVisibilityLimit.Car;
//import Lesson9_VariablesVisibilityLimit.Student;

// можно импортировать весь пакет целиком
import Lesson8_FinalStaticModifiers_Constant.*;

public class A {
    public static void main(String[] args) {

// Для создания объекта из другого класса можно указать полное имя класса и название конструктора в нем ИЛИ
        Lesson9_VariablesVisibilityLimit.Car c1 = new Lesson9_VariablesVisibilityLimit.Car ("red", "v6");
/* Импортировать класс из другого пакета см. import
* Когда в разных пакетах содержатся одинаковые классы, каждому классу нужно расписать свой пакет!
* */
        StaticNonStatic sns = new StaticNonStatic("Igor", 2);
        Lesson9_VariablesVisibilityLimit.Car c2 = new Lesson9_VariablesVisibilityLimit.Car("red", "v6");
        Lesson8_FinalStaticModifiers_Constant.Student st1 = new Lesson8_FinalStaticModifiers_Constant.Student("Yan", 3);

    }
}
