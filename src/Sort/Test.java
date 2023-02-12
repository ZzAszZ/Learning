package Sort;

import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Integer> list = List.of(1,2,3,4,1,2,3,55,3);
        HashMap<Integer, Integer> map = new HashMap<>();
        int value;
        for (Integer i: list) {
            value = map.getOrDefault(i, 0);
            map.put(i, ++value);
        }
    }
}
