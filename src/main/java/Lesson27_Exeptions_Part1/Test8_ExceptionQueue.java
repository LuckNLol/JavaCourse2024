package Lesson27_Exeptions_Part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test8_ExceptionQueue {
    public static void main(String[] args) {
// Иерархия Exception: для корректной работы, сначала идут Child классы Exceptions, а затем Parent
        try {
            File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test10.txt"); //test10 is exsist
            FileInputStream fis = new FileInputStream(f);
        } catch (NullPointerException e) {
            System.out.println("Пойман Exception 1");
        } catch (FileNotFoundException e) {
            System.out.println("Пойман Exception 2");
        } catch (IOException e) {
            System.out.println("Пойман Exception 3");
        } catch (RuntimeException e) {
            System.out.println("Пойман Exception 4");
        } catch (Exception e) {
            System.out.println("Пойман Exception 5");
        } catch (Throwable e) {
            System.out.println("Пойман Exception ");
        }
    }
}

