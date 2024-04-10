package Lesson27_2_Exeptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test1.txt");
            System.out.println("Файл test10 существует и найден");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Проблемы со стримом fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл test10 не найден");
        } catch (NullPointerException e) {
            System.out.println("Сработал NullPointerException");
        }
    }
}
