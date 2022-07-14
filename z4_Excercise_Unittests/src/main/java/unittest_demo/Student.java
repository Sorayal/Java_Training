package unittest_demo;

public class Student {
    private String vorname;
    private String nachName;
    private int alter;

    public Student(){};

    public Student(String vorname, String nachName, int alter) {
        this.vorname = vorname;
        this.nachName = nachName;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
