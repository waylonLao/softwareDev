package MainCode;

import java.util.Random;

public class RandomGenerator {

	static Random number = new Random();
	static int value = number.nextInt();
	static int test = 0;
	
	public RandomGenerator()
	{
		
	}
	       
	public RandomGenerator(int b)
	{
		value = number.nextInt(b);
	}

	public int generate(int a) 
	{
		RandomGenerator rG1 = new RandomGenerator(a);
		return value;
		
	}
	/*
	public static void main(String[] args)
	{
		RandomGenerator rg1 = new RandomGenerator(100);
		test = rg1.generate();
		System.out.println(test);
	}*/
}
