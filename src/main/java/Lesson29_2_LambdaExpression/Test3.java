package Lesson29_2_LambdaExpression;

import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = List.of("Привет", "Пока", "Как дела?", "Нормально!");
        final String str = "trreieie"; // или если без final, то далее по коду не менять больше значение выражения
        for (String s : list) {
            Predicate<String> p = z -> {
                System.out.println(str.length());
                return z.length() > 4;
            };
        }
    }
}
