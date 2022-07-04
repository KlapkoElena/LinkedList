package MyLinkedList;

public class Start {
    public static void main(String[] args) {
        MyLinkedList linkedL = new MyLinkedList();

        System.out.println("Added elements: ");
        linkedL.add(1);
        linkedL.add(2);
        linkedL.add(3);
        linkedL.add(4);
        linkedL.add(5);
        showInfo(linkedL);

        System.out.println("The element (5) is under the index: \n" + linkedL.indexOf(5));
        linkedL.indexOf(5);
        showInfo(linkedL);

        System.out.println("First element: \n" + linkedL.getFirst());
        System.out.println("Last element: \n" + linkedL.getLast());
        showInfo(linkedL);

        System.out.print("Adding a new first and last element: \n");
        linkedL.addFirst(100);
        linkedL.addLast(500);
        showInfo(linkedL);

        System.out.println("Collection size: \n" + linkedL.size);
        linkedL.removeLast();

        System.out.print("Removing element at index (5): \n");
        linkedL.remove(5);
        showInfo(linkedL);

        System.out.println("Last element of a list: \n" + linkedL.peekLast());
        showInfo(linkedL);

        System.out.println("Replace element by index (3): \n" + linkedL.set(3, 300));
        linkedL.set(3, 300);
        showInfo(linkedL);
    }

    // метод вывода
    private static void showInfo(MyLinkedList MyLinkedList) {
        for (int i = 0; i < MyLinkedList.size; i++) {
            System.out.print(MyLinkedList.get(i) + " ");
        }
        System.out.print("\n__________________________\n");
    }

}




