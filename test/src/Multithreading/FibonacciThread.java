package Multithreading;

public class FibonacciThread {
	int fibInput = 9;
	int xInput = 9;
	
	public void Fibonacci() {
		int presum = 0;
		int sum = 1;
		
		for(int i = 0; i < fibInput; i++) {
			presum = presum + sum;
			sum = sum - presum;
			
			System.out.println("Fibonacci-Folge: " + i + " " + sum);
		}
	}
	
	public void Xponential() {
		int presum = 0;
		int sum = 1;
		
		for(int i = 0; i < xInput; i++) {
			presum = presum + sum;
			sum = sum + presum;
			
			System.out.println(sum);
			}
	}

}
