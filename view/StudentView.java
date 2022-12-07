package oopseminar2.view;

import java.util.List;

import oopseminar2.data.User;
import java.util.logging.Logger;
import oopseminar2.data.Student;

public class StudentView {

    public void sendOnConsole(List<Student> users){

        Logger logger = Logger.getAnonymousLogger();

        for (User user: users){
            logger.info(user.toString() + " id: " + ((Student) user).getId());
        }

    }
    
}
