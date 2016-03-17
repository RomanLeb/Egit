package shapess;

import java.util.Random;

public class RandomGenerator {
	private Random rand=new Random(47);
	public Shape next()
	{
		switch(rand.nextInt(3)){
		default:
		case 1:return new Circle();
		case 2:return new Triangle();
		case 3:return new Rectangle();
		}
		
	}

}
