package Lesson22_ООП_Incapsulation_SuperProtected.p1;

import Lesson22_ООП_Incapsulation_SuperProtected.Human;

public class Test1 {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName("Petrrr");
        h.setAge(30);
        h.setWeigh(55);
        System.out.println("Name:" + h.getName() + ", Age:" + h.getAge() + ", Weigh:" + h.getWeigh());
    }
}
