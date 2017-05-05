//Cameron Munro 150192354

import java.util.Scanner;



public class PartB {


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		int num = 0;

		String name = "";


		System.out.print("Enter a number> ");

		num = scanner.nextInt();

		name = scanner.nextLine();


		System.out.println("You entered '" + num + "'. " + num + "x2 = " + num*2);


		System.out.print("What's your name? ");

		name = scanner.nextLine();


		System.out.println("Hello " + name + "! Your name starts with the letter " + name.charAt(0) + ".");


		scanner.close();

	}

/*
Scanner class is desinged to take an input in this case from the System i.e the hardware(Keyboard) and return it.
Depending on the methord used of an Scanner object the input is put into a data type. 
The uncommenting of  'name = scanner.nextLine();' 

allowed the scanner object to take the system input and turn it into a String returning
to be assinged to the varible name.
*/
}


