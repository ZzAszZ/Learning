import java.util.ArrayList;
import java.util.List;


public class Test4 {
    public static void main(String[] args) {

        Test4 test4 = new Test4();

        System.out.println(test4.findFibonacci(4));

    }

    public int findFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        List<Integer> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        for (int i = 0; i < n; i++) {
            list.add(list.get(i) + list.get(i + 1));
            System.out.println(list);


        }
        return list.get(n);


    }
}

