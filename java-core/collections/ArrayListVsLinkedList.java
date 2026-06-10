import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        System.out.println("initial arraylist>>>"+arrayList);

        linkedList.add(0, "apple");
        linkedList.add(1, "banana");
        linkedList.add(2, "orange");
        System.out.println("initial linkedList>>>"+linkedList);

        linkedList.add(1, "mango");
        System.out.println("linkedList updated>>>"+linkedList);

    }
}
