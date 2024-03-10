package Lesson27_Exeptions_Part1;

import java.io.*;

public class Test4_goodTryCatch {
    void abc() throws FileNotFoundException {
        File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test10.txt"); //test10 is exsist
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Всем хорошего дня");
    }

// Тут не нужно ловить NullPointerException, и писать его в сигнатуре метода т.к. это unchecked Exception, это излишнее действие
    void ghi() {
        String s = null;
        System.out.println(s.length());
    }

    void def() throws FileNotFoundException {
        System.out.println("Привет");
        abc();
    }

    public static void main(String[] args) {
        Test4_goodTryCatch test = new Test4_goodTryCatch();

        try {
            test.def();
        } catch (FileNotFoundException e) {
            IOException f = e; // допустимое написание
            System.out.println("Был пойман exception " + e);
        }
        test.ghi();
        System.out.println("Данный код не имеет отношение к исключениям, т.к. он за рамками try/catch блоков");
    }
}