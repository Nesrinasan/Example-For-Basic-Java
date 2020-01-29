package GenericYapi.model;

/**
 * Created by Nesrin aşan on 1/23/2020.
 */
public class Student extends BaseEntity{

    String name;
    String surname;
    String city;
    int studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + city + " " + studentId;
    }
}
