package Task2;

public class Student {
    private String fullName;
    private int studyYear;

    public Student(String fullName, int studyYear) {
        this.fullName = fullName;
        this.studyYear = studyYear;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }
}
