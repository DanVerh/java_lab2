package Task4;

import Task1.LinkedList;
import Task2.Grade;
import Task2.Group;
import Task2.Student;
import Task2.Subject;

public class Task4 {
    public static void main(String[] args) {
        Student john = new Student("John Johnson",  2);
        Student jack = new Student("Jack Jackson",  2);
        LinkedList<Student> sit21 = new LinkedList();
        sit21.addLast(john);
        sit21.addLast(jack);

        Student james = new Student("James Jameson",  2);
        Student joe = new Student("Joe Adams",  2);
        LinkedList<Student> sit22 = new LinkedList();
        sit22.addLast(james);
        sit22.addLast(joe);

        Group it21 = new Group("IT-21", sit21);
        Group it22 = new Group("IT-22", sit22);
        LinkedList<Group> b = new LinkedList();
        b.addLast(it21);
        b.addLast(it22);

        Subject math = new Subject("Math", b);
        Subject ukr = new Subject("Ukrainian Language", b);

        Grade johnGradeUkr = new Grade(92, ukr, john);
        Grade johnGradeMath = new Grade(83, math, john);
        Grade jackGradeUkr = new Grade(77, ukr, jack);
        Grade jackGradeMath = new Grade(88, math, jack);

        LinkedList<Grade> grades = new LinkedList();
        grades.addLast(johnGradeMath);
        grades.addLast(johnGradeUkr);
        grades.addLast(jackGradeMath);

        Journal journal = new Journal(grades);
        journal.addGrade(jackGradeUkr);

        System.out.println("All students' grades: ");
        journal.checkAllStudentsGrades();

        System.out.println();

        System.out.println("Jack's grades: ");
        journal.checkOneStudentGrades(jack);
    }
}
