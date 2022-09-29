package Task2;

public class Grade {
    private int grade;
    private Subject subject;
    private Student student;

    public Grade(int grade, Subject subject, Student student) {
        this.grade = grade;
        this.subject = subject;
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
