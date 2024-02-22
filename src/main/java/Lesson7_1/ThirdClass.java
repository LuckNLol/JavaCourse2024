package Lesson7_1;

/* При помощи полного пути или при помощи импорта можно получить данные к Классу А пакета 7 */
//import Lesson7_Package_accessModifier.Employee;

public class ThirdClass {
    public static void main(String[] args) {
        Lesson7_Package_accessModifier.Employee emp = new Lesson7_Package_accessModifier.Employee(400);
        //System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}
