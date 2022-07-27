package ifelse.if_else_test;

public class JavaTestClass {
    public String vorName;
    public String nachName;
    public int age;

    public JavaTestClass(){}

    public JavaTestClass(String vorName, String nachName, int age) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.age = age;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
