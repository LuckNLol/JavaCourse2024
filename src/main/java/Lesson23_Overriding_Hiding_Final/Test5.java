package Lesson23_Overriding_Hiding_Final;

public class Test5 {
}

class Animall {
    static String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Имя животного: " + showName());
    }
}

class Mousee extends Animall{

    static String showName() {
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Имя животного: " + showName());
    }

    public static void main(String[] args) {
        Mousee a = new Mousee();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
