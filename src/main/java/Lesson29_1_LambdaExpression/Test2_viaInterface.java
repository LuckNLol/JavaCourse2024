package Lesson29_1_LambdaExpression;


// Параметры поиска и значения задали через Интерфейс
public class Test2_viaInterface {

}

//class Student2 {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student2(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo2 {
//    void printStudent(Student2 st) {
//        System.out.println("Имя студента: " + st.name + ", Пол: " + st.sex + ", Возраст: " + st.age +
//                ", Курс: " + st.course + ", Средняя оценка: " + st.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student2> aL, StudentChecks sc) {
//        for (Student2 s : aL) {
//            if (sc.test(s)) {
//                printStudent(s);
//            }
//        }
//    }
//
//    interface StudentChecks {
//        boolean test(Student2 s);
//    }
//
//    static class FindStudentsOverGrade implements StudentChecks {
//        public boolean test(Student2 s) {
//            return s.avgGrade > 8.5;
//        }
//    }
//
//    static class FindStudentsUnderGrade implements StudentChecks {
//        public boolean test(Student2 s) {
//            return s.avgGrade < 9;
//        }
//    }
//
//    static class FindStudentsOverAge implements StudentChecks {
//        public boolean test(Student2 s) {
//            return s.age > 25;
//        }
//    }
//
//    static class FindStudentsUnderAge implements StudentChecks {
//        public boolean test(Student2 s) {
//            return s.age < 27;
//        }
//    }
//
//    static class FindStudentsBySex implements StudentChecks {
//        public boolean test(Student2 s) {
//            return s.sex == 'm';
//        }
//    }
//
//    static class FindStudentsMixedCondition implements StudentChecks {
//        public boolean test(Student2 s) {
//            return (s.avgGrade > 7.2 && s.age > 23 && s.sex == 'f');
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student2> list = new ArrayList<>();
//        Student2 st1 = new Student2("Иван", 'm', 22, 3, 8.3);
//        Student2 st2 = new Student2("Николай", 'm', 28, 2, 6.4);
//        Student2 st3 = new Student2("Елена", 'f', 19, 1, 8.9);
//        Student2 st4 = new Student2("Петр", 'm', 35, 4, 7);
//        Student2 st5 = new Student2("Мария", 'f', 23, 3, 9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo2 si = new StudentInfo2();
//
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixedCondition fsmc = new FindStudentsMixedCondition();
//
//
//        si.testStudents(list, fsog);
//        System.out.println("=================================");
//        si.testStudents(list, fsug);
//        System.out.println("=================================");
//        si.testStudents(list, fsoa);
//        System.out.println("=================================");
//        si.testStudents(list, fsua);
//        System.out.println("=================================");
//        si.testStudents(list, fsbs);
//        System.out.println("=================================");
//        si.testStudents(list, fsmc);
//
//    }
//}