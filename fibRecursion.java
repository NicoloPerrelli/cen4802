import java.util.Scanner;

public class fibRecursion {
	public static void main(String[] args) throws Exception {
		  
		//input
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter n'th fib sequence");

		String userInput = myObj.nextLine();  //user input

		int count = Integer.parseInt(userInput);

		System.out.println("The nth term of the Fibonacci sequence is " + fibRecursive(count) );
		
		myObj.close();
	}

	public static long fibRecursive(int count){
		if (count <= 1) {return count;}
		return fibRecursive(count - 1) + fibRecursive(count - 2);
	}
}