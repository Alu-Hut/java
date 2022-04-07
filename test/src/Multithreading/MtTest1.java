package Multithreading;

class MtTest1 implements Runnable{
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
		sum = sum + sum;
		
		System.out.println("Exponent: " + i + " " + sum);
		}
	
	Thread t1 = new Thread(()->{
		
	});
	Thread t2 = new Thread(new Xponential());

	t1.start();
	t2.start();
	
	}

/*
	@Override
	public void run() {
		();
*/		

/*
Thread t1 = new Thread(new MtTest1());
Thread t2 = new Thread(new MtTest2());

t1.start();
t2.start();
*/
	
	
}



