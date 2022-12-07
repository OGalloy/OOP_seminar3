package oopseminar2.controller;

import java.util.List;

import oopseminar2.service.StudyGroupService;
import oopseminar2.service.UserService;
import oopseminar2.view.StudentView;
import oopseminar2.view.StudyGroupView;
import oopseminar2.data.Student;
import oopseminar2.data.Teacher;

public class Controller {
    
    private UserService userService = new UserService();
    private StudentView studentView = new StudentView();
    private StudyGroupService studyGroupService = new StudyGroupService();
    private StudyGroupView studyGroupView = new StudyGroupView();
    public Teacher teacher1 = new Teacher("Aleksey", "Hasyangin","sds", null);
    //Создание юзера(Студента)
    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
    }

    //Получение всех юзеров
    public void getAllUsers(){
        List<Student> users = userService.getAll();
        studentView.sendOnConsole(users);
    }

    //Создаём учебную группу и учителя группы
    public void createStudyGroup(Teacher teacher) {
        studyGroupService.createStudyGroups(teacher, userService.getAll());
    
    }
    //Выводим на экран учебные группы
    public void getAllStudyGroups(){
        studyGroupView.sendOnConsole(studyGroupService.getAll());

    }
    
    public void getSortedStudens(){
        studyGroupView.sendSortedStudent(studyGroupService.sortStudents(studyGroupService.getAll()));
    }
}
