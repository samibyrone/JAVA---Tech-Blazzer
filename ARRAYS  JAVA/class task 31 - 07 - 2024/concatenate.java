import java.util.ArrayList;


public class ListConcatenation {

    public static <T> List<T> concatenateLists(List<T> list1, List<T> list2) {

        List<T> concatenatedList = new ArrayList<>(list1);

        concatenatedList.addAll(list2);

        return concatenatedList;
    }


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> result = concatenateLists(list1, list2);

        System.out.println("Concatenated List: " + result);
    }
}
