package Task3.service;

import Task1.*;
import Task2.*;

import java.time.LocalDate;
import java.util.Arrays;


public class Service {


    public Service() {
    }

    public void addSubjectGroup (final Group group, final Subject subject){
        subject.getGroups().addLast(group);
    }

    public void addSchedule (final LinkedList<Schedule> schedule, final Group group, final Subject subject, final LocalDate date){
        Schedule newSchedule = new Schedule(group, subject, date);
        schedule.addLast(newSchedule);
    }



    public void printStudentSubject(final Subject subject) {
        for (Group group : subject.getGroups()){
            for (Student student : group.getStudents()){
                System.out.println(student.getFullName());
            }
        }
    }

    public void sortStudent(final Group group) {
        int amount = 0;
        for (Student student : group.getStudents()){
            amount ++;
        }
        String [] sortSt = new String[amount];
        int index = 0;
        for (Student student : group.getStudents()){
            sortSt[index] = student.getFullName();
            index++;
        }
        Arrays.sort(sortSt);
        for(int i = 0; i < index; i++) {
            System.out.println(sortSt[i]);
        }
    }
}
