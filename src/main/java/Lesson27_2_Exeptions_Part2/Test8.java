package Lesson27_2_Exeptions_Part2;

public class Test8 {
    void marathon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguException {
        if(tempBega > 12){
            throw new PodvernutNoguException("Темп бега был слишком высоким: " + tempBega);
        }
        if(temperaturaVozduxa > 32) {
            throw new SveloMishcuExcepton("Жарковато");
        }
        System.out.println("Вы пробежали марафон");
    }

/* Если исключение выбрасывается из catch блока, то оно не м.б. обработано одноуровневым catch блоком
*  в методе marathon добавлено throws PodvernutNoguException
 */
    public static void main(String[] args) {
        Test8 t = new Test8();
        try {
            t.marathon(20, 10);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случа вы получите грамоту!");
        }
    }
}


class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }
    PodvernutNoguException () {}
}

class SveloMishcuExcepton extends RuntimeException {
    SveloMishcuExcepton(String message){
        super(message);
    }
    SveloMishcuExcepton() {}

}