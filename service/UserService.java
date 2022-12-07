package oopseminar2.service;

import java.util.List;
import java.util.ArrayList;

import oopseminar2.data.User;
import oopseminar2.data.Student;

public class UserService implements DataService{

    private List<Student> users;

    public UserService(){
        this.users = new ArrayList<Student>();
    }

    @Override
    public void createUser(String firstName, String lastName, String pytronymic) {
        Long id = 0L;
        for (User item: this.users){
            if (item instanceof Student) {
                if (id <= ((Student) item).getId())
                    id = ((Student) item).getId();
            }
        }
        this.users.add(new Student(firstName, lastName, pytronymic, ++id));
    }

    @Override
    public void deleteUser(Long id) {
        for (User item: this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student)item).getId())) {
                    this.users.remove(item);
                }
            }
        }
        
    }
    
    @Override
    public List<Student> getAll() {
        return this.users;
    }

}