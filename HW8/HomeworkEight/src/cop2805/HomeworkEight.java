//Author: Paulina Flores
//Date: 3/29/19
//Objective: Implement both methods of solving the 
//Fibonacci sequence into two separate classes that extend the Thread class. 
//The threads will have some way to set n before the thread is started. 
//In the run() function, you will execute the algorithm and time how long it takes to get an answer. 
//At the end, the thread will output the answer to the screen along with the number of milliseconds it took.
package cop2805;

public class HomeworkEight {

	public static void main(String[] args) { //main
		{
			Recursion r = new Recursion();
			r.start();
			Dynamic d = new Dynamic();
			d.start();
		}

	}
}

class Recursion extends Thread { //Recursion
	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	@Override
	public void run() { //run method for recursion
		long time = System.currentTimeMillis();
		int result = fibonacci(40);
		time = System.currentTimeMillis() - time;
		System.out.println("Recursion Thread found the answer: " + result + " in " + time + "ms");

	}
}

class Dynamic extends Thread { //dynamic
	public int fibonacci(int n) {
		int v1 = 0, v2 = 1, v3 = 0;
		for (int i = 2; i <= n; i++) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
	}

	@Override
	public void run() { //run method for dynamic
		long time = System.currentTimeMillis();
		int result = fibonacci(40);
		time = System.currentTimeMillis() - time;
		System.out.println("Dynamic Thread found the answer: " + result + " in " + time + "ms");

	}
}
