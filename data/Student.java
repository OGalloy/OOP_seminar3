package oopseminar2.data;

public class Student extends User implements Comparable<Student>{

    private Long studentId; 

    public Student(String firstName, String lastName, String patronymic, Long studentId){
        super(firstName, lastName, patronymic);
        this.studentId = studentId;

    }

    public Long getId() {
        return studentId;
    }

    public void setId(Long id) {
        this.studentId = id;
    }

    

    @Override
    public int compareTo(Student o) {  
        return this.getLastName().compareTo(o.getLastName());
    }
}
