package Lesson19_varargs_foreach;

public class Test5_array1 {
    public static void main(String[] args) {
        String [] students = {"Иванов", "Петров", "Сидоров"};
        String [] exams = {"math analiz", "filosophy"};

        for(String s1: students) {
            for (String ex: exams) {
                System.out.println(s1 + " " + ex);
            }
        }
    }
}
