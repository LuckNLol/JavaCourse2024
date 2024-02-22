package Lesson20_3_ArrayList_add_Collections;

import java.util.HashMap;
import java.util.Map;

public class Test3_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Petrov Nail");
        map.put(779, "Gurina Fekla");
        map.put(780, "Besson Luka");
        map.put(781, "Simpson Gomer");
        map.put(779, "Some Guye"); // перезапишет данные 779 выше
// дубликаты не поддерживаются
        map.remove(779);
        System.out.println(map);


    }

}
