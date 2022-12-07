package oopseminar2.data;

import java.util.List;

public class StudyGroup {
    //Поля учебной группы.
    private Teacher teacher;
    private List<Student> students;
    //id учебной группы.
    private Long studyGroupId;
    
    //Конструктор учёбной группы.
    public StudyGroup(Teacher teacher, List<Student> students, Long studyGroupId) {
        this.teacher = teacher;
        this.students = students;
        this.studyGroupId = studyGroupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getStudyGroupId() {
        return studyGroupId;
    }

    public void setStudyGroupId(Long studyGroupId) {
        this.studyGroupId = studyGroupId;
    }
    
}
