import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		double price = 0.0;
		double amountTendered = 0.0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the price of the item:");
		price = kb.nextDouble();
		System.out.println("Price entered: $" + price);
		System.out.println("Please enter the amount tendered:");
		amountTendered= kb.nextDouble();
		System.out.println("Amount tendered: $" + amountTendered);
		
		// Determine if amount tendered is enough. too much, or exactly the price
		if (amountTendered < price) {
			System.out.println("The amount given is too little");
		}
		else if(amountTendered == price) {
			System.out.println("Thank you for your purchase! Have a nice day!");
		}
		else {
			makeChange(price, amountTendered);
			System.out.println(". Thank you for your purchase.");
		}
		
	}
		public static void makeChange(double price, double amountTendered) {
			double change = 0.0;
			//Types of bills
			int twenties, tens, fives, ones = 0;
			//Types of change
			int quarters, dimes, nickels, pennies = 0;
			
			change = amountTendered - price;
			
			System.out.printf("Your change is $" + "%.2f",change);
			System.out.println(". ");
			
			// Determine change in dollar bills:
		    if (change % 20 == 0){
				System.out.print(" One twenty dollar bill, ");
				change = change - 20;
				
			} 
			else if (change % 20 > 0) {
				twenties = (int)(change/20);
				System.out.print(twenties + " twenty dollar bills, ");
				change = change - (twenties * 20);
				
			}
		    if (change % 10 == 0){
				System.out.print(" one ten dollar bill, ");
				change = change - 10;
				
			} 
			else if (change % 10 > 0) {
				tens = (int)(change/10);
				System.out.print(tens + " ten dollar bills, ");
				change = change - (tens * 10);
				
			}
		    if (change % 5 == 0){
				System.out.print(" one five dollar bill, ");
				change = change - 5;
				
			} 
			else if (change % 5 > 0) {
				fives = (int)(change/5);
				System.out.print(fives + " five dollar bills, ");
				change = change - (fives * 5);
				
			}
		    if (change / 1 == 0){
				System.out.print(" one one dollar bill, ");
				change = change - 1;
				
			} 
			else if (change / 1 > 0) {
				ones = (int)(change/1);
				System.out.print(ones + " one dollar bills, ");
				change = change - (ones * 1);
				
			}
		    
		    System.out.println("and, ");
		    
		    // Cents: in cents mult by 100
		    if (change > 0) {
		    	change = change * 100;	
		    	
		    }
		    if (change % 25 == 0){
				System.out.print(" one quarter, ");
				change = change - 25;
				
			} 
			else if (change % 25 > 0) {
				quarters = (int)(change/25);
				System.out.print(quarters + " quarters, ");
				change = change - (quarters * 25);
				
			}
		    if (change % 10 == 0){
				System.out.print(" one dime, ");
				change = change - 10;
				
			} 
			else if (change % 10 > 0) {
				dimes = (int)(change/10);
				System.out.print(dimes + " dimes, ");
				change = change - (dimes * 10);
				
			}
		    if (change % 5 == 0){
				System.out.print(" one nickel, ");
				change = change - 5;
				
			} 
			else if (change % 5 > 0) {
				nickels = (int)(change/5);
				System.out.print(nickels + " nickels, ");
				change = change - (nickels * 5);
				
			}
		    if (change / 1 == 0){
				System.out.print(" one penny");
				change = change - 1;
				
			} 
			else if (change / 1 > 0) {
				pennies = (int)(change/1);
				System.out.print(pennies + " pennies");
				change = change - (pennies * 1);
				
			}		
			
		}
}


