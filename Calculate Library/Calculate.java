//return x = i got no clue
public class Calculate {
	public static double square (double x) {
		return x * x;
	}
	public static double cube (double x) {
		return x * x * x;
	}
	public static double average2(double x, double y) {
		return (x+y)/2;	
	}
	public static double average3(double x, double y, double z) {
		return (x+y+z)/3;	
	}
	public static double toDegrees(double x) {
		return (3.14159 / x) * (180 / 3.14159);	
	}
	public static double toRadians(double x) {
		return x * (3.14159/180);
	}
	public static double discriminant(double x, double y, double z) {
		return (x * x) - (4 * y * z); 
	}
	public static String toImproperFrac(int x, int y, int z) {
		return ((z * x) + y) + "/" + x;
	}
	public static String toMixedNum(int x, int y){
		return ((x / y) + "_" + (x % y) + "/" + y );
	}
	public static String foil (int w, int x, int y , int z, String n){
		return (w * x) + "n^2 + " + 2*(y + z) + "n + " + (y * z);
	}
//doesnt work for any decimals <1
	public static boolean isDivisibleBy (int x, int y){
			if ((x/y) < 1){
				return false;
				}
			else {	
		return true;
		}
	}
	public static double absValue (double x){
			if (x > 0){
				return x * (1);
				}
			else {
		return  x * (-1);
		}
	}
	public static int max2 (int x, int y){
		if (x > y){
			return x;
			}
		else {
	return y;		
	}
}
	public static int max3 (int x, int y, int z){
		return x;
	}
	public static int min (int x, int y){
		if (x < y){
			return x;
			}
		else {
	return y;		
	}
}
//only works on decimals <.01
	public static double round2 (double x){
		if (x >= .005){
			return x + (.01-x);
				}
			else {
		return x - x;
		}
	}
}
