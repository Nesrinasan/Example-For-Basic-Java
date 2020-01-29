package GenericYapi.model;

/**
 * Created by Nesrin aşan on 1/23/2020.
 */
public class Teacher extends BaseEntity{
    String name;
    String surname;
    String city;
    int teacherId;

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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + city + " " + teacherId;
    }
}
