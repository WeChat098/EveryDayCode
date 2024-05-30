import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(4);
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        map.put(1,list);
        List<Integer> test =  map.get(1).stream().sorted().toList();
        System.out.println(test);
    }
}
