package Lesson4_ClassAndObject.HomeWork;

public class StudentTest {

    // HW5: Метод расчета средней арифметической
    double avgGradeValue(Student stud) {
        double result = (stud.AvgMathGrade + stud.AvgEconomyGrade + stud.AvgLanguageGrade)/3;
        // Данные выводятся отсюда
        System.out.println("Средняя арифметическая оценка " + stud.FirstName + " " + stud.LastName + ": " + result);
        return result;
    }

    public static void main(String[] args) {

        // Создание обектов Класса Student (Конструктор без параметров, см. Lesson5 HW)
        Student Student1 = new Student();
        Student1.StudIdNumber = "1";
        Student1.FirstName = "Stepan";
        Student1.LastName = "Bobikov";
        Student1.StudyYear = 2;
        Student1.AvgMathGrade = 3.6;
        Student1.AvgEconomyGrade = 4.2;
        Student1.AvgLanguageGrade = 5.0;

        Student Student2 = new Student();
        Student2.StudIdNumber = "2";
        Student2.FirstName = "Elena";
        Student2.LastName = "Epanko";
        Student2.StudyYear = 4;
        Student2.AvgMathGrade = 4.2;
        Student2.AvgEconomyGrade = 4.3;
        Student2.AvgLanguageGrade = 3.5;

        Student Student3 = new Student();
        Student3.StudIdNumber = "3";
        Student3.FirstName = "Boba";
        Student3.LastName = "Fett";
        Student3.StudyYear = 1;
        Student3.AvgMathGrade = 4.8;
        Student3.AvgEconomyGrade = 5.0;
        Student3.AvgLanguageGrade = 4.9;

        // Средняя арифметическая оценка для каждого студента
        double Stud1GradeAvg = (Student1.AvgMathGrade + Student1.AvgEconomyGrade + Student1.AvgLanguageGrade)/3;
        double Stud2GradeAvg = (Student2.AvgMathGrade + Student2.AvgEconomyGrade + Student2.AvgLanguageGrade)/3;
        double Stud3GradeAvg = (Student3.AvgMathGrade + Student3.AvgEconomyGrade + Student3.AvgLanguageGrade)/3;

        // HW5: Вывод на печать с использованием метода для рассчета средней арифметической
        StudentTest stTest = new StudentTest();
        stTest.avgGradeValue(Student1);
        stTest.avgGradeValue(Student2);
        stTest.avgGradeValue(Student3);
    }
}
