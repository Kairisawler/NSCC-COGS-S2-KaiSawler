
public class KS_Module_01 {

	public static void main(String[] args) {
	   
		System.out.println("Integer MAX_VALUE: " + (Integer.MAX_VALUE - 12));
		System.out.println("Largest Long Value: " + Long.MAX_VALUE);
		System.out.println("Smallest Double plus 100: " + (Double.MIN_VALUE + 100));
		System.out.println("All Printable Characters: ");
		for (int j = 32; j < 256; j++) {
			if (j < 127 || j > 159) {
				System.out.print((char) j);
			}
		}
		System.out.println("");
		System.out.println("All Booleans: " + Boolean.TRUE+ " " + Boolean.FALSE);
		System.out.println("Min & Max Byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println("Max Float: " + Float.MAX_VALUE);
		
		System.out.println("Number: ");
		for (int k = 3; k < 11; k++) {
			System.out.println(k);
		}
		System.out.println("Number * 5: ");
		for (int l = 3; l < 11; l++) {
			int m = (l * 5);
			System.out.println(m);
		}
		System.out.println("Number / 5: ");
		for (int o = 3; o < 11; o++) {
			int p = (o / 5);
			System.out.println(p);
		}
		System.out.println("Number / 5 + 5 / (Number - 7): ");
//		for (int q = 3; q < 11; q++) {
//			if (q != 7) {
//				// if q is 7, it'll attempt to divide by 0
//				int r = ((q / 5) + 5 / (q - 7));
//				System.out.println(r);
//			}
//			else {
//				System.out.println("EXCEPTION: Divide by Zero! Variable = " + q);
//			}
//		}
//		int x = 0;
//		while (x < 10) {
//			try {
//				for (int q=3; q < 11; q++) {
//					int r = ((q / 5) + 5 / (q - 7));
//					System.out.println(r);
//				}
//			}
//			catch (ArithmeticException e) {
//				System.out.println("You're attempting to divide by Zero!");
//			}
//			x++;
//		}	
		for (int q=3; q < 11; q++) {
			try {
				int r = ((q / 5) + 5 / (q - 7));
				System.out.println(r);
			}
			catch (ArithmeticException e) {
				System.out.println("You're attempting to divide by Zero!");
			}
		}
	}
}
