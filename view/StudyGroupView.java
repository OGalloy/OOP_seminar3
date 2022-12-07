package oopseminar2.view;

import java.util.logging.Logger;
import java.util.List;
import java.util.Map;
import oopseminar2.data.Student;

import oopseminar2.data.StudyGroup;

public class StudyGroupView {
    public void sendOnConsole(List<StudyGroup> studyGroups ){
        Logger logger = Logger.getAnonymousLogger();

        for(StudyGroup studyGroup: studyGroups){
            logger.info(studyGroup.getStudents() + "\n" + studyGroup.getTeacher() + " " + studyGroup.getStudyGroupId());
        }
    }

    public void sendSortedStudent(Map<Student, Long> map){
        Logger logger = Logger.getAnonymousLogger();

        for (Map.Entry<Student, Long> entry: map.entrySet()){
            logger.info(": L.F. " + entry.getValue() + " groupId: " + entry.getKey());

        }
    }
}
