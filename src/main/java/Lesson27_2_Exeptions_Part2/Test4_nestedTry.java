package Lesson27_2_Exeptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4_nestedTry {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test10.txt");
            try {
                fis2 = new FileInputStream("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test1.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Файл test1 не найден");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test10 не найден");
        } finally {
            System.out.println("Это внешний finally блок");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найдено исключение в finally блоке");
            }
        }
    }

    public static void main(String[] args) {
        Test4_nestedTry t = new Test4_nestedTry();
        t.abc();
    }
}
