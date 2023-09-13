public class MyTestArrayList {
    public static void main(String[] args) {

        myArrayListTest();

    }

    private static final int N = 1000000;

    public static void myArrayListTest() {

        System.out.println("-------------------------------------- MyArrayList test");

        MyArrayList<Integer> myArrayList = new MyArrayList<>();


        for (int i = 0; i < N; i++) {

            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());


        for (int i = 0; i < 10; i++) {
            System.out.println("myArrayList.remove(i) = " + myArrayList.get(i));
            myArrayList.remove(i);
        }


        System.out.println("myArrayList.size() before clear() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.size() after clear() = " + myArrayList.size());

    }
}
