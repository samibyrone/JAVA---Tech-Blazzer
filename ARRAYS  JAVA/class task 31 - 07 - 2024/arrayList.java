import java.io.*;
import java.util.*;
class RevArrayList {

	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {

		ArrayList<Integer> revArrayList = new ArrayList<Integer>();

		for (int i = alist.size() - 1; i >= 0; i--) {

			revArrayList.add(alist.get(i));
		}

		return revArrayList;
	}

	public void printElements(ArrayList<Integer> alist) {

		for (int i = 0; i < alist.size(); i++) {

			System.out.print(alist.get(i) + " ");
		}
	}
}





public class GFG {

	public static void main(String[] args) {

		RevArrayList obj = new RevArrayList();

		ArrayList<Integer> arrayli = new ArrayList<Integer>();

		arrayli.add(new Integer(1));
		arrayli.add(new Integer(2));
		arrayli.add(new Integer(3));
		arrayli.add(new Integer(4));

		System.out.print("Elements before reversing:");
		obj.printElements(arrayli);

		arrayli = obj.reverseArrayList(arrayli);

		System.out.print("\nElements after reversing:");
		obj.printElements(arrayli);

	}
}
