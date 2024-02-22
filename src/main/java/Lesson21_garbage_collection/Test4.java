package Lesson21_garbage_collection;

public class Test4 {
    int acb() {
        return 5;
    }

    int abc2(int i) {

        if (i > 10) {
            return 5;
        } else {
            return 6;
        }

    }

    public static void main(String[] args) {
        int a = new Test4().acb();
        new Test4().acb();
        System.out.println(a);

        Test4 t4 = new Test4();
         System.out.println(t4.abc2(11));

    }

}
