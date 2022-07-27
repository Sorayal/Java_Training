package keyword_final.student_demo;

public class Student {
    private String surname;
    private String lastName;

    public Student(String surname, String lastName) {
        this.surname = surname;
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
