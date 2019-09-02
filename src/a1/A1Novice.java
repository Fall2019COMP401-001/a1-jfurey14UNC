package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalCust = scan.nextInt();
		for(int i=0; i<totalCust; i++) {

			String first = scan.next();
			String last = scan.next();
			int totalItem = scan.nextInt();
			double totalCost = 0;
			for(int j=0; j<totalItem; j++) {
				double quan = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
				totalCost = totalCost + quan * price;
			}
			String.format("%.2f", totalCost);
			System.out.println(first.charAt(0) + ". " + last + ": " + String.format("%.2f", totalCost));
	
		}
	}
}
