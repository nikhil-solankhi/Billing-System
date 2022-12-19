//project by Eklavya and Nikhil
package bill.pizza;

import java.util.Scanner;

import bill.pizzacl.PizzaBillingCL;

public class PizzaBillingMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Pizza Hut");

		int total = 0, cart = 0, choice = 0;
		int[] price = new int[20];
		int pindex = 0;
		int psum = 0;
		int Grand_total = 0;
		String name;
		long contNo = 0;
		int per_index = 0;
		boolean flagshut = true;
		int toke = 0;

		String[] bucket = new String[20];
		int index = 0;
		boolean flag = true, flag1 = true, flag2 = true;
		int choose = 0;
		PizzaBillingCL[] prr = new PizzaBillingCL[50];

		do {
			
			total = 0;
			cart = 0;

			for (int i = 0; i < index; i++) {
				price[i] = 0;
				bucket[i] = null;
			}
			pindex = 0;
			index = 0;
			flag = true;
			flag1 = true;
			flag2 = true;
			psum = 0;
			Grand_total = 0;
			System.out.println("-----------------------------------------------------");
			System.out.println("\nPress 1. Take customer order\nPress 2. Close shop\nPress 3. Retrieve Customer Data");
			choose = input.nextInt();
			
			switch (choose) {
			case 1:
				cls();
				System.out.println("-----------------------------------------------------");
				System.out.print("Please enter customer Name: ");
				name = input.next();
				System.out.println();
				System.out.print("Please enter customer Contact No. ");
				contNo = input.nextLong();
				System.out.println();

				do {System.out.println("Please order from the below menu");
					System.out.println("1.Pizza\n2.Burger\n3.Beverages\n4.Desert\n5.Exit");
					System.out.print("Choose from menu: ");
					choice = input.nextInt();
					switch (choice) {
					case 1:
						cls();
						System.out.println(
								"Pizza Menu->\n1.Peppy Paneer[INR 159]\n2.Farmhouse[INR 199]\n3.Countryside[INR 299]\n4.Magherita[INR 189]\n5.Back to Main Menu");
						do {

							choice = input.nextInt();
							switch (choice) {
							case 1:
								price[index] = 159;
								bucket[index] = "Peppy Paneer[INR 159]";
								index++;
								System.out.println("Peppy Paneer added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								
								break;
							case 2:
								price[index] = 199;
								bucket[index] = "Farmhouse[INR 199]";
								index++;
								System.out.println("Farmhouse added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 3:
								price[index] = 299;
								bucket[index] = "Countryside[INR 299]";
								index++;
								System.out.println("Countryside added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 4:
								price[index] = 189;
								bucket[index] = "Magherita[INR 189]";
								index++;
								System.out.println("Magherita added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 5:
								flag1 = false;
								System.out.println("Back to menu");
								cls();
								break;
							default:
								System.out.println("Kindly choose from Pizza menu");
								break;
							}
						} while (flag1);
						flag1 = true;
						break;
					case 2:
						cls();
						System.out.println(
								"Burger Menu->\n1.Maharaja[INR 249]\n2.Aloo Tikki[INR 149]\n3.Chicken Cheesy[INR 349]\n4.Veg Whooper[INR 179]\n5.Back to Main Menu");
						do {
							choice = input.nextInt();
							switch (choice) {
							case 1:
								price[index] = 249;
								bucket[index] = "Maharaja[INR 249]";
								index++;
								System.out.println("Maharaja added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 2:
								price[index] = 149;
								bucket[index] = "Aloo Tikki[INR 149]";
								index++;
								System.out.println("Aloo Tikki added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 3:
								price[index] = 349;
								bucket[index] = "Chicken Cheesy[INR 349]";
								index++;
								System.out.println("Chicken Cheesy added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 4:
								price[index] = 179;
								bucket[index] = "Veg Whooper[INR 179]";
								index++;
								System.out.println("Veg Whooper added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 5:
								flag1 = false;
								System.out.println("Back to menu");
								cls();
								break;
							default:
								System.out.println("Kindly choose from Burger menu");
								break;
							}
						} while (flag1);
						flag1 = true;
						break;
					case 3:
						cls();
						System.out.println(
								"Beverages Menu->\n1.Mojito[INR 199]\n2.Pepsi[INR 99]\n3.Dew [INR 89]\n4.Coke [INR 119]\n5.Back to Main Menu");
						do {
							choice = input.nextInt();
							switch (choice) {
							case 1:
								price[index] = 199;
								bucket[index] = "Mojito[INR 199]";
								index++;
								System.out.println("Mojito added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 2:
								price[index] = 99;
								bucket[index] = "Pepsi[INR 99]";
								index++;
								System.out.println("Pepsi added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 3:
								price[index] = 89;
								bucket[index] = "Dew [INR 89]";
								index++;
								System.out.println("Dew added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 4:
								price[index] = 119;
								bucket[index] = "Coke [INR 119]";
								index++;
								System.out.println("Coke added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 5:
								flag1 = false;
								System.out.println("Back to menu");
								cls();
								break;
							default:
								System.out.println("Kindly choose from Beverages menu");
								break;
							}
						} while (flag1);
						flag1 = true;
						break;
					case 4:
						cls();
						System.out.println(
								"Desert Menu->\n1.Choco Lava[INR 199]\n2.Red Valvet[INR 249]\n5.Back to Main Menu");
						do {
							choice = input.nextInt();
							switch (choice) {
							case 1:
								price[index] = 199;
								bucket[index] = "Choco Lava[INR 199]";
								index++;
								System.out.println("Choco Lava added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 2:
								price[index] = 249;
								bucket[index] = "Red Valvet[INR 249]";
								index++;
								System.out.println("Red Valvet added to cart|_|> ");
								cart++;
								System.out.println("Items in cart " + cart);
								break;
							case 5:
								flag1 = false;
								System.out.println("Back to menu");
								cls();
								break;
							default:
								System.out.println("Kindly choose from desert menu");
								break;
							}
						} while (flag1);
						flag1 = true;
						break;
					case 5:
						cls();
						flag = false;
						break;
					default:
						System.out.println("Kindly choose from menu");
						break;
					}
				} while (flag);
				cls();
				System.out.println("-----------------------------------------------------");
				System.out.println("Your cart                                           |");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < index; i++) {
					System.out.println((i + 1) + " " + bucket[i]);
				}
				do {
					System.out.println("-----------------------------------------------------");
					System.out.println("Press 1 to edit cart\nPress 2 to generate bill");
					int press = input.nextInt();

					if (press == 1) {
						System.out.println("Enter item no. which you want to delete");
						int del = input.nextInt();
						cart--;
						System.out.println("Item no " + (del) + ". " + bucket[del - 1] + " removed from your cart");
						System.out.println("Total Items in your cart " + cart);
						for (int i = (del - 1); i < index; i++) {
							price[i] = price[i + 1];
							bucket[i] = bucket[i + 1];
						}
						index--;
					} else {
						flag2 = false;
						cls();
						System.out.println("-----------------------------------------------------");
						System.out.println("You ordered                                         |");
						System.out.println("-----------------------------------------------------");
						for (int i = 0; i < index; i++) {
							System.out.println((i + 1) + " " + bucket[i]);
						}
						for (int i = 0; i < index; i++) {
							psum = psum + price[i];
						}
						Grand_total = psum;
						System.out.println("-----------------------------------------------------");
						System.out.println("Total: " + Grand_total);
						System.out.println("GST: " + (Grand_total * 0.18));
						System.out.println("-----------------------------------------------------");
						System.out.println("Grand Total: " + (Grand_total + (Grand_total * 0.18)));
						System.out.println("-----------------------------------------------------");
						System.out.println(
								"***Thank You for Ordering your order will be shortly served on your table!***");
						prr[per_index] = new PizzaBillingCL();
						prr[per_index].setName(name);
						prr[per_index].setMob(contNo);
						prr[per_index].setG_total(Grand_total);
						per_index++;

					}
				} while (flag2);
				break;
			case 2:
				cls();
				flagshut = false;
				break;
			case 3:
				cls();
				System.out.print("Order retrievel Window");
				System.out.print("Enter order no. of customer: ");
				toke = input.nextInt();
				prr[toke - 1].display();
			}
		} while (flagshut);
		System.out.println("-----------------------------------------------------");
		System.out.println("Shutting down order taking appplication..............");
		System.out.println("Creators Nikhil[220601615] and Eklavya[220700198]");
		System.out.println("-----------------------------------------------------");
	}

	public static void cls() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception E) {
			System.out.println(E);
		}
	}
}