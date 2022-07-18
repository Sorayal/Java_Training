package java_tutorial.generics;

/**
 * Generische Klasse.
 * Die Rakete kann jedes beliebige Java Objekt aufnehmen.
 *
 * Namenskonvention bei Generics T = Typ, E = Element, K = Key/Value, V = Value
 * Es lassen sich auch andere Parameternamen einsetzen, aber die sollten nicht
 * nach echten Klassennamen aussehen.
 */

// Typparameter kommt hinter den Klassennamen
public class Rocket <T> {
    private T value;

    public Rocket(){}

    public Rocket(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public void empty(){
        value = null;
    }
}

/**
 * Nicht generische Klasse
 */

/*
public class Rocket {
    private Object value;

    public Rocket(){}

    public Rocket(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public void empty(){
        value = null;
    }
}


 */