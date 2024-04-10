package Lesson27_2_Exeptions_Part2.HomeWork;

public class HW28 {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это finally блок");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {

    public void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoException("Тигр не ест " + eda);
        }
        System.out.println("Тигр ест мясо");
    }

    public void drink(String voda) throws NeVodaException {
        if (!voda.equals("voda")) {
            throw new NeVodaException("Тигр не пьет " + voda);
        }
        System.out.println("Тигр пьет воду");
    }
}


