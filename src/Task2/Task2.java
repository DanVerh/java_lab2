package Task2;

import Task1.*;

public class Task2 {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan Ivanovich",  2);
        LinkedList<Student> a = new LinkedList();
        a.addFirst(ivan);
        Group IT21 = new Group("IT-21", a);
    }
}
