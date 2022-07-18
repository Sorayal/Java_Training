package java_tutorial.generics;

/**
 * Welche Rakete trägt die grössere Nummer?
 * Explizite Typumwandlungen sollten möglichst vermieden werden, wenn möglich.
 * Aber der Typ, den die Rakete aufnehmen kann, soll generisch sein, daß heisst,
 * es soll möglich sein, unterschiedliche Typen aufnehmen können.
 *
 * Rocket<T> : generischer Typ (generic type)
 * T : Typparameter (formal type parameter)
 * Rocket<Long> : parametrisierter Typ (parameterized type)
 * Long : Typargument (actual type parameter)
 * Rocket : Orginaltyp (raw type)
 */

public class PlayerRocketDemo {
    public static void main(String[] args) {
        Player michael = new Player();
        michael.name = "Omar Arnold";
        Rocket rocket = new Rocket();
        Long aBigNumber = 11111111111L;
        rocket.set(aBigNumber);
        michael.leftRocket = rocket;
        michael.rightRocket = new Rocket(2222222222222222222L);

        System.out.println(michael.name + " transportiert in der Rakete " + michael.leftRocket.get() +
                " und " + michael.rightRocket.get());

        Long val1 = (Long) michael.leftRocket.get();
        Long val2 = (Long) michael.rightRocket.get();

        System.out.println(val1.compareTo(val2) > 0 ? "Links" : "Rechts");

        Rocket<Integer> intRocket = new Rocket<>();
        Rocket<String> stringRocket = new Rocket<>();
        intRocket.set(1);
        int x = intRocket.get();
        System.out.println(x);

        stringRocket.set("Selbstzerstörungsauslösungsschalterhintergrundbeleuchtung");
        String s = stringRocket.get();
        System.out.println(s);

        // Geschachtelte Generics
        Rocket<Rocket<String>> rocketOfRockets = new Rocket<Rocket<String>>();
        rocketOfRockets.set(new Rocket<String>());
        rocketOfRockets.get().set("Inner Rocket<String>");
        System.out.println(rocketOfRockets.get().get()); // Inner Rocket<String>
    }
}
