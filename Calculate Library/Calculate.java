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
	public static boolean isDivisibleBy (int x, int y){
			if ((x % y) > 0){
				return false;
				}
			else {	
		return true;
		}
	}
	public static double absValue (int x){
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
		if (x>y && x>z){
			return x;
		}
		else {
			if (y>z){
				return y;
			}
			else { 
				}
				return z;
			}
	}
	public static int min (int x, int y){
		if (x < y){
			return x;
			}
		else {
	return y;		
	}
	}
	public static double round2 (double x){
		return (100 * (x + .005))/100; 
	}
	public static double exponent(double x, int y){
		double ans = 1;
	    if (y != 0) {
	        int base = y > 0 ? y : (-1) * y;
	        for (int i = 1; i <= base; i++) {
	            ans *= x;
	        }

	        if (y < 0) {
	            
	            ans = 1.0 / ans;
	        }
	    } else {
	        
	        ans = 1;
	    }

	    return ans;
	}

	public static int factorial(int x){
			for (int i = (x-1); i <= x && i > 0; i-- )
				x *= i;
			return x;
			}
		

	public static boolean isPrime(int x){
		if (x % 2 == 0)
			return false;
			for(int i = 3; i * i <= x; i +=2)
				if (x % i == 0) return false;
				return true;
			}
	public static int greatestCommon(int a, int b){
		while (a != 0 && b != 0) {
			if (a >= b){
				a = a - b;
			}
			else
				b = b-a;
			}
		if (a ==0) return b;
		else return a;
		}
		public static double sqrt(double x){
			double t;
			double squareRoot = x/2;
			do {
				t= squareRoot;
				squareRoot = (t + (x / t)) / 2;
			} while ((t-squareRoot) != 0);
			
			return squareRoot;
		}
}
