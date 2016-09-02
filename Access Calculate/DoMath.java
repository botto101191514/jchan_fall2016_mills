
public class DoMath {

	public static void main(String[] args) {
		System.out.println("5 squared: " + Calculate.square(5));
		System.out.println("3 cubed: " + Calculate.cube(3));
		System.out.println("average of 32 and 4 : " + Calculate.average2(32,4));
		System.out.println("average of 32, 5, and 27: " + Calculate.average3(32, 5, 27));
		System.out.println("pi/2 radians to degrees: " + Calculate.toDegrees(2));
		System.out.println("270 degrees to radians: " + Calculate.toRadians(270));
		System.out.println("discriminant: " + Calculate.discriminant(3, 4, 2));
		System.out.println("improperfrac: " + Calculate.toImproperFrac(2, 1, 4));
		System.out.println("mixed number: " + Calculate.toMixedNum(7, 2));
		System.out.println("foiling: " + Calculate.foil(2, 4, 6, 8, "n"));
		System.out.println("6/2 is divisible: " + Calculate.isDivisibleBy(6 , 2));
		System.out.println("abs. value of -8: " + Calculate.absValue(-8));
		System.out.println("which number is more, 3 or 4? " + Calculate.max2(3, 4));
		System.out.println("which is less, 5 or 3? " + Calculate.min(5, 3));
		System.out.println("rounding up to 2 decimal places: " + Calculate.round2(0.005));
	}
}