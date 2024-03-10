package Lesson27_Exeptions_Part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
    void abc() {
        int[] array = {1, 3, 6};
        System.out.println(array[5]);
    }

    void def() throws ArrayIndexOutOfBoundsException {
        abc();
    }

    public static void main(String[] args) {
        Test6 test = new Test6();
        try {
            test.def();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception пойман");
//            System.out.println(e);
//            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
