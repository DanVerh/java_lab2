package Task4;

import Task1.*;
import Task2.*;

public class Journal {
    private LinkedList<Grade> grades;

    public Journal(LinkedList<Grade> grades) {
        this.grades = grades;
    }

    public void addGrade (final Grade grade){
        grades.addLast(grade);
    }

    public void deleteGrade (final Student student, final Subject subject){
        for (Grade grade : grades){
            if(grade.getStudent().equals(student) && grade.getSubject().equals(subject)){
                grade = null;
            }
        }
    }

    public void editGrade (final Student student, final Subject subject, final int newGrade){
        for (Grade grade : grades){
            if(grade.getStudent().equals(student) && grade.getSubject().equals(subject)){
                grade.setGrade(newGrade);
            }
        }
    }

    public void checkAllStudentsGrades (){
        for (Grade grade : grades){
            System.out.println(grade.getGrade());
        }
    }

    public void checkOneStudentGrades (final Student student){
        for (Grade grade : grades){
            if(grade.getStudent().equals(student))
                System.out.println(grade.getGrade());
        }
    }

    public void checkOneSubjectGrades (final Subject subject){
        for (Grade grade : grades){
            if(grade.getSubject().equals(subject))
                System.out.println(grade.getGrade());
        }
    }

}
