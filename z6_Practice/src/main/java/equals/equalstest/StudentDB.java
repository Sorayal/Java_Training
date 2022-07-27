package equals.equalstest;

public class StudentDB {
    private String surName;
    private String lastName;
    private String age;

    public StudentDB(String surName, String lastName) {
        this.surName = surName;
        this.lastName = lastName;
    }

    public StudentDB(String surName, String lastName, String age) {
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
