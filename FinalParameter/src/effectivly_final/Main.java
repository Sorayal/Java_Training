package effectivly_final;

import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
        String hello = "hello";
        String world = "world";
        String test = hello + " " + world;
        System.out.println(test);
        System.out.println(hello);

    }
}


