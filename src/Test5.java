import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {


        Object obj = new Object();


        int[] input = {10, 6, 10, 10, 7, 10, 10, 8,8,10,9,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            map.merge(input[i], 1, Integer::sum);
        }

        map.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

}


 class MySingleton{
    private static MySingleton singleton = null;

    private MySingleton() {
    }

    public synchronized static MySingleton getInstance() {
        if (singleton == null) {
            singleton = new MySingleton();
        }
        return singleton;
    }


}