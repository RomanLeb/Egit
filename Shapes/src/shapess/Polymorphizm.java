package shapess;

public class Polymorphizm {
private static RandomGenerator randShape=new RandomGenerator();
	public static void main(String[] args) {
		Shape[] s=new Shape[9];
		for(int i=0;i<9;i++) s[i]=randShape.next();
		for(Shape shp:s) shp.draw();
		// TODO Auto-generated method stub

	}

}
