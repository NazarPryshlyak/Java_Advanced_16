package JavaAdvanced_Lesson16.dao;

import JavaAdvanced_Lesson16.domain.Student;

import java.util.List;

public interface StudentDao {

    Student create(Student student);

    Student readById(int id);

    List<Student> readAll();

    Student update(Student student);

    void delete(int id);

}