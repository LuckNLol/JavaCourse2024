package Lesson15_while_do_while;

public class Test2_while {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -= 10;
            System.out.println("Баланс: " + money);
        }

    }
}

