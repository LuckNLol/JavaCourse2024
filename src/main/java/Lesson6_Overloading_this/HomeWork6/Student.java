package Lesson6_Overloading_this.HomeWork6;

public class Student {
    Integer StudIdNumber;
    String FirstName;
    String LastName;
    Integer StudyYear;

    // Оценики по пятибальной шкале
    Double AvgMathGrade;
    Double AvgEconomyGrade;
    Double AvgLanguageGrade;


// Конструкторы

    // Конструктор принимает все параметры.
    Student(Integer StudIdNumber1, String FirstName1, String LastName1, Integer StudyYear1,
            Double AvgMathGrade1, Double AvgEconomyGrade1, Double AvgLanguageGrade1) {
        StudIdNumber = StudIdNumber1;
        FirstName = FirstName1;
        LastName = LastName1;
        StudyYear = StudyYear1;
        AvgMathGrade = AvgMathGrade1;
        AvgEconomyGrade = AvgEconomyGrade1;
        AvgLanguageGrade = AvgLanguageGrade1;
    }

    // Конструктор принимает 4 параметра.
    Student(Integer StudIdNumber2, String FirstName2, String LastName2, Integer StudyYear2 ) {
        this(StudIdNumber2, FirstName2, LastName2, StudyYear2, 0.0, 0.0, 0.0);
    }

    // Конструктор принимает 0 параметров.
    Student(){}
}

class StudentTest1 {

    double avgArithmGrade (Student st) {
        double srednOcenka = (st.AvgMathGrade + st.AvgEconomyGrade + st.AvgLanguageGrade)/3;
        System.out.println("Средняя арифметическая студента: " + st.FirstName + " " + st.LastName + " " + srednOcenka);
        return srednOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3, "Фил", "Бобов", 2, 4.5, 4.0, 5.0);
        st1.StudIdNumber = 1;
        st1.FirstName = "Боб";
        st1.LastName = "Крузз";
        st1.StudyYear = 3;
        st1.AvgMathGrade = 4.3;
        st1.AvgEconomyGrade = 4.66;
        st1.AvgLanguageGrade = 3.99;

        Student st2 = new Student(32, "Иван", "Дудь", 4);
        st2.AvgMathGrade = 4.13;
        st2.AvgEconomyGrade = 3.66;
        st2.AvgLanguageGrade = 3.49;

        Student st3 = new Student(12, "Антон", "Сидоров", 3, 3.3, 3.6, 5.0);

        StudentTest1 sTest = new StudentTest1();
            sTest.avgArithmGrade(st1);
            sTest.avgArithmGrade(st2);
            sTest.avgArithmGrade(st3);

    }

}