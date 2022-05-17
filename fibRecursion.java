import java.util.Scanner;

public class FibRecursion {
	public static void main(String[] args) throws Exception {
		  
		//input
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter n'th fib sequence");

		String userInput = myObj.nextLine();  //user input
        
        //some filter here for proper inputs

		int count = Integer.parseInt(userInput);

		System.out.println("The nth term of the Fibonacci sequence is " + fibRecursive(count) );
		
		myObj.close();
	}

    /**
     * Allows one to enter a whole number and get returned a position from the Fibonacci sequence using a recursive method.
     * @param count (int) as a dynamic selection for position
     * @return The nth position in the Fibonacci sequence as a long
     * @author Nicolo Perrelli
     */
	public static long fibRecursive(int count){
		if (count <= 1) {return count;}
		return fibRecursive(count - 1) + fibRecursive(count - 2);
	}
}