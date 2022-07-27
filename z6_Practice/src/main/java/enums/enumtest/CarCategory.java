package enums.enumtest;

public enum CarCategory {
    VAN("Van"),
    KOMBI("Kombi"),
    LIMOUSINE("Limousine");

    private final String value;

    CarCategory(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
