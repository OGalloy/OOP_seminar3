package oopseminar2.service; 

import oopseminar2.data.Student;
import java.util.List;

public interface DataService{

    void createUser(String firstName, String lastName, String patronymic);
    List<Student> getAll();
    void deleteUser(Long id);
}
