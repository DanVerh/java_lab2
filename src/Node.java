public class Node<T> {
    private Node prev;
    private T element;
    private Node next;

    public Node() {
    }

    public Node(Node prev, T element, Node next) {
        this.prev = prev;
        this.element = element;
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
