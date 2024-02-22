package Lesson16_Class_String.HomeWork16;

// Нужно найти подстроку между @ и .
public class HW {
    public void email(String str) {
        int x = 0;  // @
        int y = 0;  // .
        int z = 0;  // ;
        while (z < str.length() - 1) {

            x = str.indexOf('@', z);
            y = str.indexOf('.', z);
            z = str.indexOf(';', z+1);
            System.out.println(str.substring(x + 1, y)); // a+1 следующий символ после @
        }
    }

    public static void main(String[] args) {
        HW hw = new HW();
        hw.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}
