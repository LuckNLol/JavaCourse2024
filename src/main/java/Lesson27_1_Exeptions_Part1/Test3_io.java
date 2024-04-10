package Lesson27_1_Exeptions_Part1;

import java.io.*;

public class Test3_io {
    public static void main(String[] args) throws Exception {
// Абстрактная репрезентация пути к файлу. Компилятор и ран-тайм машина не проверяют есть этот файл или нет
        File f = new File("C:\\Users\\anduser\\IdeaProjects\\Aston_education\\JavaCourse2024\\src\\main\\java\\test10.txt");
        try {
// Получить информацию из файла
            FileInputStream fis = new FileInputStream(f);
            int i;
            while ((i = fis.read()) != -1) { //.read
                System.out.print((char) i);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Поймано исключение " + e);
        }
        catch (IOException e) {
            System.out.println("Поймано IO исключение " + e);
        }

        System.out.println();
// Записать информацию в файл
        FileOutputStream fos = new FileOutputStream(f, true);
        String addText = "Hello world! This is a new note \r\n";
        fos.write(addText.getBytes()); // .write
        fos.close();

        System.out.println("Вывод за пределами try/catch");

    }

}

