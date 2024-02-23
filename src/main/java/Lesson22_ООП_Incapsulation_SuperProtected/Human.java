package Lesson22_ООП_Incapsulation_SuperProtected;

public class Human {
    final String sex;

    public Human(String sex) {
        this.sex = sex;
    }

    private boolean clever;
    public boolean isClever(){
        return clever;
    }


    private String name;

    // StringBuildr не должен изменять исходный метод get. Как этого добиться?
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(String s) {
        name = s;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a > 0 && a < 110) {
            age = a;
        } else {
            System.out.println("Недопустимый возрастной диапазон");
        }
    }

    private int weigh;

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int w) {
        if (w > 0 && w < 200) {
            weigh = w;
        } else {
            System.out.println("Недопустимый весовой диапазон");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName("Petr");
        h.setAge(30);
        h.setWeigh(55);
        h.getName().append("!!!"); //имя не изменится при выводе, т.к. тут ведется работа с копией имени
        System.out.println("Name:" + h.getName() + ", Age:" + h.getAge() + ", Weigh:" + h.getWeigh());
        h.setAge(-30);
        System.out.println("Age:" + h.getAge());
     }
}