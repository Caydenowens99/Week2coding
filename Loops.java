package week2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a. A while loop that prints all even numbers from 0 to 100
		int x = 2;
		while (x < 100) {
			System.out.println(x);
			x = x +2;
		}
		// b. A while loop that prints every 3rd number going backwards from 100 until we reach 0
		
		int y = 100;
		while (y > 0) {
			System.out.println(y);
			y = y - 3;
		} 
		//c. A for loop that prints every other number from 1 to 100
		int z = 1;
		while (z < 100) {
			System.out.println(z);
			z = z +2;
			}
		// d. A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” 
		// instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is 
		// divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
	
		int i = 0;
		for (i = 0; i < 100; i = i +1) {
			if (i % 3 == 0 && i% 5 == 0) {
				System.out.println("Hello World");
			}
			else if (i % 5 == 0) {
				System.out.println("World");
			}
			else if (i % 3 == 0) {
				System.out.println("Hello");
			}
			else {
				System.out.println(i);
			}
	
	}
	}
}