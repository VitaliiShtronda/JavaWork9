class Main{
    public static void main(String[] args) {

        // MyArrayList test
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        System.out.println("MyArrayList: " + myArrayList);
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 1: " + myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println("MyArrayList after removing element at index 1: " + myArrayList);
        myArrayList.clear();
        System.out.println("MyArrayList after clear: " + myArrayList);


        // MyLinkedList test
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("apple");
        myLinkedList.add("banana");
        myLinkedList.add("orange");
        System.out.println("MyLinkedList: " + myLinkedList);
        System.out.println("Size: " + myLinkedList.size());
        System.out.println("Element at index 1: " + myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println("MyLinkedList after removing element at index 1: " + myLinkedList);
        myLinkedList.clear();
        System.out.println("MyLinkedList after clear: " + myLinkedList);

        // MyStack test
        MyStack<Character> myStack = new MyStack<>();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        System.out.println("MyStack size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("MyStack size after pop: " + myStack.size());
        myStack.clear();
        System.out.println("MyStack size after clear: " + myStack.size());
    }

}