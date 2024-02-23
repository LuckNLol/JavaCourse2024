package Lesson22_ООП_Incapsulation_SuperProtected.HomeWork;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder n) {
        if (n.length() > 3) {
            this.name = n;
        } else {
            System.out.println("Имя меньше 3х символов");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c >= 1 && c <= 4) {
            this.course = c;
        } else {
            System.out.println("Недопустимое значение курса");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if (g >= 1 && g <= 10) {
            this.grade = g;
        } else {
            System.out.println("Оценка неправильная");
        }
    }

    public void showInfo() {
        getName();
        getCourse();
        getGrade();
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName(new StringBuilder("Ivan"));
        std.setCourse(3);
        std.setGrade(9);
        std.showInfo();
        System.out.println("Name:" + std.getName() + "," + " Course:" + std.getCourse() + "," + " Grade:" + std.getGrade());

    }
}