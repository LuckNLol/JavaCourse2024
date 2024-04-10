package Lesson27_2_Exeptions_Part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {

    void abc() throws FileNotFoundException {
        try {
            File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test1.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println(" немного обработан");
            throw e;
        } finally {
            System.out.println("Это блок finally");
        }
    }

    void nethod () { // либо вместо try/catch в сигнатуре написать throws FileNotFoundException
        try {
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception пойман и полностью обработан");
        }
    }

//    void def() throws FileNotFoundException {
//        try {
//            int[] array = {3, 4, 2};
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception пойман и немного обработан");
//            throw e;
//        } finally {
//            System.out.println("Это блок finally");
//        }
//    }

}
