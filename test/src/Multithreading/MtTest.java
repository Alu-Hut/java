package Multithreading;
import java.time.Duration;
import java.time.Instant;

//import java.time.Duration;

class MtTest {

	public static void Fibonacci(int count, int fibInput) {
		int presum = 0;
		int sum = 1;
		
		for(int i = 0; i < fibInput; i++) {
			presum = presum + sum;
			sum = sum - presum;
			
			System.out.println(count + ": Fibonacci-Folge: " + presum);
			}
		}

	public static void Xponential(int count, int xInput) {
		int presum = 0;
		int sum = 1;
		
		for(int i = 0; i < xInput; i++) {
			presum = presum + sum;
			sum = sum + presum;
			
			System.out.println(count + ": Exponent: " + i + " " + sum);
			}
		
		
		
	
		
	}
	

	public static void main(String[] args) {
		int fibInput = 100;
		int xInput = 100;
		
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				int count = 0;
				
				while(count < 10) {
					Instant start = Instant.now();
					
					System.out.println("starttime " + start.getNano());
					
					Fibonacci(count, fibInput);
					count += 1;
					Instant end = Instant.now();
					System.out.println("endtime " + end.getNano());
					System.out.println((Duration.between(start, end).toNanos() / 1000) + " MicroSecs");
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				int count = 0;
				
				while(count < 10) {
					Instant start = Instant.now();
					Xponential(count, xInput);
					count += 1;
					Instant end = Instant.now();
					System.out.println((Duration.between(start, end).toMillis() * 1000 ) + " Microsecs");
			}
		}
	});
		
	t1.start();
	t2.start();

	}

}
