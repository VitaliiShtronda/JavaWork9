public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();

        myList.add("Ivan");
        myList.add("Peter");
        myList.add("Alice");

        System.out.println("Size: " + myList.size());
        System.out.println("First element: " + myList.getFirstNode().getValue());
        System.out.println("Last element: " + myList.getLastNode().getValue());

        myList.remove(1);
        System.out.println("Size after removal: " + myList.size());

        System.out.println("Element at index 0: " + myList.get(0));
        System.out.println("Element at index 1: " + myList.get(1));

        myList.clear();
        System.out.println("Size after clearing: " + myList.size());
    }
}


