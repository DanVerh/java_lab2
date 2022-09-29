import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    protected Node head;
    protected int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public T getIndexElement(final int index){
        int count = 0;
        Node pointer = this.head;

        if (pointer.getNext() == null){
            throw new IllegalArgumentException("There is no element with this index");
        }

        while (count != index){
            pointer = pointer.getNext();
            count++;
        }

        return (T) pointer.getElement();
//        Node<T> result = head;
//        for (int i = 0; i < index; i++) {
//            result = result.getNext();
//        }
//        return result.getElement();
    }


    public void addLast(T element) {
        Node newNode = new Node(head, element, null);

        if (head == null){
            head = newNode;
            return;
        } else {
            Node last = getLast();
            last.setNext(newNode);
        }
        size++;
    }

    private Node getLast(){
        Node pointer = this.head;

        if (pointer.getNext() == null){
            return pointer;
        }

        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }

        return pointer;
    }



    public void addFirst(T element) {
        Node newNode = new Node(null, element, head);

        if (head == null){
            head = newNode;
            return;
        } else {
            Node first = head;
            first.setPrev(newNode);
        }
        size++;
    }


    public int size() {
        return this.size;
    }


    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index <= size();
        }

        @Override
        public T next() {
            return getIndexElement(index++);
        }
    }
}
