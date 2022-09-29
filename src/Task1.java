public class Task1 {
    public static <T> void printList(final Iterable<T> iterable) {
        for (final T element : iterable) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        LinkedList a = new LinkedList();

        a.addFirst(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);




        System.out.println("Printed List:");
        printList(a);

        System.out.println();
        System.out.println("Element with index 2: " + a.getIndexElement(2));

        System.out.println();
        System.out.println("Size of the List " + a.size());
    }
}
