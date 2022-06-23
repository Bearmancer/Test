import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList(List.of("Johnny","Ben","Xerxes"));

        stringLinkedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(stringLinkedList);

        stringLinkedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o2, String o1) {
                return o2.compareTo(o1);
            }
        });

    }
}
