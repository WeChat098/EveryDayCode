import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.addFirst(5);
        System.out.println(list);
        list.addLast(23);
        int a = list.getFirst();
        System.out.println(a);
        list.remove();
        System.out.println(list);
    }
}
