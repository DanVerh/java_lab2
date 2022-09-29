package Task2;

import Task1.*;

public class Subject {
    private String name;
    private LinkedList<Group> groups;

    public Subject(String name, LinkedList<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Group> getGroups() {
        return groups;
    }

    public void setGroups(LinkedList<Group> groups) {
        this.groups = groups;
    }
}
