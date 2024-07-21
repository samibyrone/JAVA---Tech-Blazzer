import java.util.Scanner;

public class DisplayFourPatterns {

	public static void main(String[] args) {

        	int first;
		int second;
		int form;

		System.out.println("\nPattern A");
		for (first = 1; first <= 6; first++) {
			for (second = 1; second <= first; second++) {
				System.out.print(second + " ");
            		}
			System.out.println();
		}
				System.out.println();



		  System.out.println("\nPattern B");
  			for (int i = 1; i <= 6; i++) {
        			for (int j = 1; j <= 7 - i; j++) {
            				System.out.print(j + " ");
        			}
        			System.out.println();
    			}

    		System.out.println("\nPattern C");
    			for (int i = 1; i <= 6; i++) {
        			for (int k = 1; k <= 6 - i; k++) {
            				System.out.print("  ");
        			}
        			for (int j = 1; j <= i; j++) {
            				System.out.print(j + " ");
        			}
       		 			System.out.println();
    			}

    
		System.out.println("\nPattern D");
    			for (int i = 1; i <= 6; i++) {
        			for (int k = i; k > 1; k--) {
           	 			System.out.print("  ");
        			}
        			for (int j = 1; j <= 7 - i; j++) {
            				System.out.print(j + " ");
        			}
        				System.out.println();
    			}
		}
	}





//		System.out.println("\nPattern B");
//		for (first = 1; first <= 6; first--) {
//			for (second = 1; second >= first; second++) {
//				System.out.print(second + " ");
//          		}
//			System.out.println();
//		}
//				System.out.println();
//					
//		
//		System.out.println("\nPattern C");
//		for (first = 1; first <= 6; first++) {
//			for (form = 1; form <= first; form++) {
//				System.out.print(" ");
//			}
//			for (second = 1; second <= first; second++) {
//				System.out.print(second + " ");
//          		}
//			System.out.println();
//		}
//				System.out.println();
//
//
//		System.out.println("\nPattern D");
//		for (first = 1; first <= 6; first++) {
//			for (form = 1; form > first; form--) {
//				System.out.print(" ");
//			}
//			for (second = 6; second >= first; second--) {
//				System.out.print(second + " ");
//          		}
//			System.out.println();
//		}
//
//        }
//    }                                                                                                                                                                                                                                                                                                                                                                                    
