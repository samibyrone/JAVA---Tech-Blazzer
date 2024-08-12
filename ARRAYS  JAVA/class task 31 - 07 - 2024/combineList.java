import java.util.ArrayList;
import java.util.List;

public class CombineLists {

    public static int[] combineAlternating(List<Integer> list1, List<Integer> list2) {

        int maxLength = Math.max(list1.size(), list2.size());

        int[] combinedArray = new int[list1.size() + list2.size()];

        int index = 0;

        for (int i = 0; i < maxLength; i++) {

            if (i < list1.size()) {

                combinedArray[index++] = list1.get(i);
            }

            if (i < list2.size()) {

                combinedArray[index++] = list2.get(i);
            }
        }

        return combinedArray;
    }



    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        int[] result = combineAlternating(list1, list2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
