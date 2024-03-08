package Lesson25_Polimorphism_instanseof;

public class Test5 {
    public static void main(String[] args) {
        String[] array1 = {"privet", "poka"};
        Object[] array2 = array1;  // UPcasting
        String [] array3 = (String[]) array2; // DOWNcasting
        //array3[0] = new StringBuilder("Ok") // ОШИБКА! Массив это объект String
        array2[0] = new StringBuilder("Ok"); /* НЕ ОШИБКA, т.к. StringBuilder это Object,
        Но на выходе Exeption, т.к. меняем StringBuilder(ом) массив String */
    }
}
