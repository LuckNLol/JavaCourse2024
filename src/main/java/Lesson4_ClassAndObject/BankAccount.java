package Lesson4_ClassAndObject;

public class BankAccount {


    // Делаем шаблон банковского счета (instance variable)
    int id;
    String name;
    double balance;

    //HW5: Добавить 2 метода (пополнение/снятие) баланса
    double popolnenieSheta(double popolneniye) {
        balance += popolneniye;
        return balance;
    }

    double snyatieSoSheta(double snyatie) {
        balance -= snyatie;
        return balance;
    }
}

/* Создадим объект в новом Классе на основании класса BankAccount
при помощи выозова конструктора. Цель конструктора - создать Объект */
class BankAccountTest {
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        // присвоим id, name, balance для аккаунтов
        MyAccount.id = 1;
        MyAccount.name = "Deposit";
        MyAccount.balance = 120.34;

        YourAccount.id = 2;
        YourAccount.name = "Credit";
        YourAccount.balance = 550.00;

        HisAccount.id = 3;
        HisAccount.name = "РЕПО";
        HisAccount.balance = 250.50;

        System.out.println(MyAccount.popolnenieSheta(550));
        System.out.println(YourAccount.snyatieSoSheta(300));

    }

}