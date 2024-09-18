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
		System.out.println("Name a toy");
		String toy = in.nextLine();
		System.out.println("Where are you going to take it for a walk");
		String place = in.nextLine();
		System.out.println("What is your favourite TV show?");
		String show = in.nextLine();
		int num2 = in.nextInt();
		System.out.println("One day, you decide to go to a pet shop. You see many pets you like. After, you see these pets you decide to choose a "+name+" as your pet. Then, you decide to give it a name and you name it "+username+". After you read more information about "+username+", you find out that he is "+num1+" years old. The price for this pet is $"+price+". You go to the cashier and they asked for one reason you want the pet and you say "+reason+" as one of your reasons why you want the pet. Then, you decide to bring it back home and feed "+username+" "+food+". You decide to play with "+username+" with a "+toy+". After, you decide to take it on a walk to "+place". An hour has passed and you go home to watch your favourite TV show "+show" with "+username+". You both go to sleep. It has been "+num2+" years and you are still having fun!);
		
	}

}
