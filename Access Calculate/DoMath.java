
public class DoMath {

	public static void main(String[] args) {
		System.out.println("5 squared: " + Calculate.square(5));
		System.out.println("3 cubed: " + Calculate.cube(3));
		System.out.println("average of 32 and 4 : " + Calculate.average2(32,4));
		System.out.println("average of 32, 5, and 27: " + Calculate.average3(32, 5, 27));
		System.out.println("pi/2 radians to degrees: " + Calculate.toDegrees(2));
	}
}