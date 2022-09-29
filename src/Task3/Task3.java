package Task3;

import Task1.LinkedList;
import Task2.Group;
import Task2.Student;
import Task2.Subject;
import Task3.service.*;

import java.security.Provider;

public class Task3 {
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

        Service serv = new Service();
        serv.printStudentSubject(math);

        System.out.println();

        serv.sortStudent(it21);
    }
}
