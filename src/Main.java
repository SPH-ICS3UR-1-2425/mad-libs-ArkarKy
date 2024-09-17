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
		System.out.println("Name an animal:  ");
		String name = in.nextLine(); 
		System.out.println("What are you going to name the Animal: ");
		String username = in.nextLine();
		System.out.println("How old is the Animal?:  ");
		int num1 = in.nextInt();
		//flush
		in.nextLine(); 
		System.out.println("What is their ethnicity: ");
		String country = in.nextLine();
		System.out.println("Where does it live: ");
		String live = in.nextLine();
		System.out.println("You enter a Zoo and you see a, "+name+" when you see it you decide to give it a name, and you name it "+username+" you read more information about "+username+". You find out that he is "+numb+" ");
		
	}

}
