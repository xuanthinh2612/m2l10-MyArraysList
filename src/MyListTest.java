public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        MyList<Integer> myList1 = new MyList<>(20);
//        System.out.println(myList1.size());
//        System.out.println(myList.size());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(6);
        myList.add(3,4);
        System.out.println(myList);
        System.out.println(myList.remove(5));
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.contains(5));
        System.out.println(myList.indexOf(3));
        System.out.println(myList.get(0));



    }
}
