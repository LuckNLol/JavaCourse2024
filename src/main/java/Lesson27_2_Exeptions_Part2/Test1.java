package Lesson27_2_Exeptions_Part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Privet");
        try {
            File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            System.out.println("Переменная 'а' в catch блоке равна: " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Это блок finally");
            System.out.println("Переменная 'а' в finally блоке равна: " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}