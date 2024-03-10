package Lesson27_Exeptions_Part1;

import java.io.*;

public class Test9 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test10.txt");
            System.out.println("Объект файл создался");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream создался");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Информация читается");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("This is finally");
        }
    }

}

