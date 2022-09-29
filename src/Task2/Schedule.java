package Task2;

import java.time.LocalDate;

public class Schedule {
    private Group group;
    private Subject subject;
    private LocalDate date;

    public Schedule(Group group, Subject subject, LocalDate date) {
        this.group = group;
        this.subject = subject;
        this.date = date;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
