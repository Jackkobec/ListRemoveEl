import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class ArrayListRemove {
    //Java 8
    public static List<Integer> remove(List<Integer> input, int el) {
        input.removeIf(i -> i == el);
        return input;
    }

    //Iterator
    public static List<Integer> remove2(List<Integer> input, int el) {
        Iterator<Integer> intIter = input.iterator();
        while (intIter.hasNext()) {
            Integer i = intIter.next();
            if (i == el) {
                intIter.remove();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        int el = 2;

        int ar = 2;
        int ar2 = 3;
        int ar3 = 2;
        int ar4 = 2;
        int ar5 = 2;
        int ar6 = 2;
        int ar7 = 2;

        input.add(ar);
        input.add(ar2);
        input.add(ar3);
        input.add(ar4);
        input.add(ar5);
        input.add(ar6);
        input.add(ar7);

        System.out.println(input);
        //System.out.println(remove(input, el));
        System.out.println(remove2(input, el));

    }
}
