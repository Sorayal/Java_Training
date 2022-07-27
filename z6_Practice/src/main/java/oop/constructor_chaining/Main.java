package oop.constructor_chaining;

class A{
    A(int i){
        System.out.println("A Konstruktor" + i);
    }
}

class B extends A{
    B(int i){
        super(i);
        System.out.println("B Konstruktor");
    }
}

class C extends B{
    private A y = new A(42);
    C(){
        super(11);
        System.out.println("C Konstruktor");
    }
}

public class Main {
    public static void main(String[] args) {
        C x = new C();
    }
}

