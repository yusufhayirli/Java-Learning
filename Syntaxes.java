package javalearning;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Classlearning {
	
	static void ArrayMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of your array: ");
		int n = scanner.nextInt(); //n here is the length of myArray
		System.out.println("Enter increase amount: ");
		int a = scanner.nextInt(); //We can get another inputs by using Scanner class
		long [] myArray = new long[n];
		for (int i=0;i<n;i++) { //initiate i as 0 and increase 1 at every iteration...
							 	//until i is not lower than n.
			myArray[i]=i+a; //At every iteration adds "int a" to "int i" and prints it.
			System.out.println(myArray[i]);
		}
	}
	
	static void StringMethod() {
		String s1 = "Hello ", s2 = "Wolrd!";
		String s3 = s1 + s2;
		System.out.println(s1+"+ "+s2+" = "+s3);
		//We put "Hello " into String s1 and "World!" into String s1
		//And merge them together in String variable s3
	}
	
	static void PrintMethod() {
		int a = 5, b, c; //initiate int a, int b, int c and put 5 into a
		b = a + 5; //Summation a and 5 into b
		c = a * b; //Multiplication a and b into c
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("If we write only a+b+c, it does not prints a,b,c... "
				+ "It sums them and prints summation as: "+(a+b+c));
		System.out.println(a+b+c);
		//then prints a: value of a, b: value of b, c: value of c...
	}
	
	static void ifMethod() 
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a value: ");
		int x = 0; //Initiate x as 0...
		int n = scanner.nextInt(); //Gets an input by Scanner class and puts into n...
		if (x!=n) { //If x is not equal to n...
		
			System.out.println("They are not equal!"); //If x!=n, prints this.
		}
		else {
			System.out.println("They are equal."); //If x=n, prints this.
		} //Basic if/else statements end here.
		
		//This below is Nested if/else statement:
		if ( x < n ) { //If x is smaller than n...
			
			if (n>=1000) {//Also if n is greater or equal than 1000...
				
				x = n+2; //Puts n+2 into x
			}
			else {
				x = n; //Puts n's value into x
			}
		}
		else if ( x > n ) { //If x is greater than n...
			
			x = n+1; //Puts n+1 into x
		}
		else {//If, If cases are not true, use this case.(We have only one option left as equality "=" )
			
			x = n-1; //Puts n-1 into x
		}
		//Nested if/else statements end here.
		
		System.out.println(x); //Prints x anyway.
		
		
	}
	
	static void SwitchcaseMethod() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch(n) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 0:
			System.out.println("Done.");
			break;
		default:
			System.out.println("You did not enter any valid value!");
			break;
		}
	}
	
	static void ForMethod() {
		for (int i=0;i<=10;i++) { //i counts 0 to 10 (because of i<=10)
			System.out.println("i -> "+i); //when i turns, it prints i
			for (int j=0;j<5;j++) { //at every iteration i, we count j 0 to 4 (because of j<5)
				System.out.println(i+j); //at every nested iteration, it sums a and b and prints.
				
				//Nested for loop ends here.
			}
		}
			
	}
	static void WhileMethod() {
		int n=50; //initiate n as 50
		int a=20; //initiate a as 20
		int response1 = 0; //initiate response1 as 0
		int response2 = 0; //initiate response1 as 0
		while (response1==0) { //if response1 is equal to 0, launch the statement below.
			System.out.println("n: "+n);
			n--; //decrease n
			if (n==0) { //if n is equal to 0...
				response1=1; //assign 1 to response1 (it means response1 is no longer be "0")
			} 
			//Until here, if response1 is still 0, launch the statement again. Otherwise, it breaks.
		}
		do { //do the statement below first.
			System.out.println("a: "+a);
			a--; //decrease a
			if (a==0) { //if a is equal to 0....
				response2=1; //assign 1 to response2 (it means response2 is no longer be "0")
			}
		
		} while (response2==0); //Check if response2 is 0 or not. If it is, launch the statement above again.
								//Otherwise, do not.
	}
	
	public static void Generics() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		//These "<Integer>" parts are generics, it means, you cannot put anything,
		//instead of integers, only integer additions possible.
		myList.add(3); //Adds 3 into the myList
		myList.add(5); //Adds 5 into the myList
		myList.add(7); //Adds 7 into the myList
		//myList.add("John"); //This does not work for our ArrayList, 
							//because it's type must be integer.
		System.out.println(myList); //[3, 5, 7]
	}
	
	public static void main(String[] args) {
		// We call our methods in our main
		ArrayMethod(); 
		StringMethod();
		PrintMethod();
		ifMethod();
		SwitchcaseMethod();
		ForMethod();
		WhileMethod();
		Generics();
		
	}
	
}
