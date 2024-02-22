package Lesson16_Class_String;

public class Test1_string_methods {

    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int c = s1.length();
        System.out.println(c); // длина строки

        char c1 = s1.charAt(3);
        System.out.println(c1); // показывает символ по указанному индексу

        int c2 = s1.indexOf("i");
        System.out.println(c2); // узнать индекс символа

        int c3 = s1.indexOf("vet"); // узнать индекс до первого совпадения
        System.out.println(c3);

        int c4 = s1.indexOf("z"); // символ, который не существует, будет равен -1
        System.out.println(c4);

        int c5 = s1.indexOf("a", 5); // начать поиск номера индекса для "а" с 5-го символа
        System.out.println(c5);

        boolean c6 = s1.startsWith("abc"); // узнать, начитается ли строка с "abc"
        System.out.println(c6);

        boolean c7 = s1.endsWith("abc"); // узнать, заканчивается ли строка с "abc"
        System.out.println(c7);



    }

}
