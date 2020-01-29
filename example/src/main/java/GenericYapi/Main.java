package GenericYapi;

import GenericYapi.PageView.OgrenciPage;
import GenericYapi.Service.StudentOperation;
import GenericYapi.Service.TeacherOperation;
import GenericYapi.model.Student;
import GenericYapi.model.Teacher;

/**
 * Created by Nesrin Aşan on 1/23/2020.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nesrin");
        student.setSurname("Aşan");
        student.setCity("İstanbul");

        StudentOperation studentOperation = new StudentOperation();
        studentOperation.getClassValue(student);

        Teacher teacher = new Teacher();
        teacher.setName("Burak");
        teacher.setSurname("Aşan");
        teacher.setCity("İstanbul");

        TeacherOperation teacherOperation = new TeacherOperation();
        teacherOperation.getClassValue(teacher);

        OgrenciPage ogrenciPage = new OgrenciPage();

    }
}
