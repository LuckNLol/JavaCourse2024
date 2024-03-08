package Lesson23_Overriding_Hiding_Final.homeWork;

class F{
    String s1 = "privet";
}

class N extends F {
    boolean bool = false;
}


 class Test5 {
    public static void main(String[] args) {
        F f = new N();
        //System.out.println(f.s1 + " " + f.bool); // ошибка
    }
}
