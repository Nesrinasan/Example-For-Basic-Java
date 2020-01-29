package GenericYapi.Service;

import GenericYapi.model.Student;

/**
 * Created by Nesrin Aşan on 1/23/2020.
 */
public class StudentOperation extends BaseEntityService<Student> {

    public StudentOperation() {
        super(Student.class);
    }
}
