package oopseminar2.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import oopseminar2.data.StudyGroup;
import oopseminar2.data.Teacher;
import oopseminar2.data.Student;

public class StudyGroupService{

    private List<StudyGroup> studyGroups;
    public StudyGroupService(){
        this.studyGroups = new ArrayList<StudyGroup>();
    }

    public void createStudyGroups(Teacher teacher, List<Student> students) {
        Long id = 0L;
        for (StudyGroup group: studyGroups) {
            if (group instanceof StudyGroup){
                if (id <= group.getStudyGroupId()) {
                    id = group.getStudyGroupId();
                }
            }
        }
        studyGroups.add(new StudyGroup(teacher ,students.subList(0, 4), id+1));
        studyGroups.add(new StudyGroup(teacher ,students.subList(4, 9), id+2 ));
    }

    public List<StudyGroup> getAll() {
        return this.studyGroups;
    }
    
    public Map<Student, Long> sortStudents(List<StudyGroup> studyGroups){
        TreeMap<Student, Long> sortedMap = new TreeMap<>();
        for (StudyGroup studyGroup: studyGroups ){
            for (Student student: studyGroup.getStudents()) {
                sortedMap.put(student, studyGroup.getStudyGroupId());
            }

        }
        return sortedMap;
    }
}
