package Multithreading;

public class XponentialThread {
	int xInput = 9;

	public void Xponential() {
		int presum = 0;
		int sum = 1;
		
		for(int i = 0; i < xInput; i++) {
			presum = presum + sum;
			sum = sum + sum;
			
			System.out.println(sum);
		}

	}
	
}
