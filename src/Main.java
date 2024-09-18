import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Arkar
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Name a pet:  ");
		String name = in.nextLine(); 
		System.out.println("Give a Name: ");
		String username = in.nextLine();
		System.out.println("Give a number  ");
		int num1 = in.nextInt();
		System.out.println("Give me a different number");
		double price = in.nextDouble(); 
		in.nextLine();
		System.out.println("Give a reason why you want a pet: ");
		String reason = in.nextLine();
		System.out.println("Name a food ");
		String food = in.nextLine();
		System.out.println("One day, you decide to go to a pet shop. You see many pets you like. After, you see these pets you decide to choose a "+name+" as your pet. Then, you decide to give it a name and you name it "+username+". After you read more information about "+username+", you find out that he is "+num1+" years old. The price for this pet is $"+price+". You go to the cashier and they asked for one reason you want the pet and you say "+reason+" as one of your reasons why you want the pet. Then, you decide to bring it back home and feed "+username+" "+food+".");
		
	}

}
