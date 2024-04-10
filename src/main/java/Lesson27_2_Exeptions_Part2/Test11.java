package Lesson27_2_Exeptions_Part2;

public class Test11 {
    void abc() {
        System.out.println("Метод abc");
        throw new StackOverflowError();
    }
    void def() {
        try {
            abc();
            return;
        }
        finally {
            System.out.println("Это finally блок");
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.def();
    }
}
