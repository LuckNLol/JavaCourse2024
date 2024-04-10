package Lesson27_2_Exeptions_Part2;

import java.io.*;

public class Test12 {
    public static void main(String[] args) {
        Animal a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Animal {
    void run() throws IOException {
        System.out.println("Животные бегают");
    }

    void run(int a) throws Exception { // Overloaded методо может бросать любые Exception
        System.out.println("Животные бегают");
    }
}

class Mouse extends Animal {
    @Override
    void run() {
        System.out.println("Мышь бегает");
    }
}