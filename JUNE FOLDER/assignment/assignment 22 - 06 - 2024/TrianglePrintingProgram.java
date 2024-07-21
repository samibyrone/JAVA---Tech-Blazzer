import java.util.Scanner;

public class TrianglePrintingProgram {

	public static void main(String[] args) {

        	int first;
		int second;
		int form;

		System.out.println("\n(A)");
		for (first = 1; first <= 10; first++) {
			for (second = 1; second <= first; second++) {
				System.out.print("*");
            		}
			System.out.println();
		}


		System.out.println("\n(B)");
		for (first = 1; first <= 10; first++) {
			for (second = 10; second >= first; second--) {
				System.out.print("*");
            		}
			System.out.println();
		}
			
		
		System.out.println("\n(C)");
		for (first = 1; first <= 10; first++) {
			for (form = 1; form < first; form++) {
				System.out.print(" ");
			}
			for (second = 10; second >= first; second--) {
				System.out.print("*");
            		}
			System.out.println();
		}

		
		System.out.println("\n(D)");
		for (first = 1; first <= 10; first++) {
			for (form = 10; form > first; form--) {
				System.out.print(" ");
			}
			for (second = 1; second <= first; second++) {
				System.out.print("*");
            		}
			System.out.println();
		}

        }
    }                                                                                                                                                                                                                                                                                                                                                                                    