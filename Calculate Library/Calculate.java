//jason chan 10/3/16 1st period
public class Calculate {
	//number^2
	public static double square (double x) {
		return x * x;
	}
	//number^3
	public static double cube (double x) {
		return x * x * x;
	}
	//average of 2
	public static double average(double x, double y) {
		return (x+y)/2;	
	}
	//average of 3
	public static double average(double x, double y, double z) {
		return (x+y+z)/3;	
	}
	//radians to degrees
	public static double toDegrees(double x) {
		return (x) * (180 / 3.14159);	
	}
	//degrees to radians
	public static double toRadians(double x) {
		return x * (3.14159 / 180);
	}
	//discriminant
	public static double discriminant(double a, double b, double c) {
		return (square(b)) - (4 * a * c); 
	}
	//number to an improper fraction
	public static String toImproperFrac(int x, int y, int z) {
		return ((z * x) + y) + "/" + x;
	}
	//number to a mixed number
	public static String toMixedNum(int x, int y){
		return ((x / y) + "_" + (x % y) + "/" + y );
	}
	//foil polynomials
	public static String foil (int w, int x, int y , int z, String n){
		if (w * z < 0 ){
			return (w * y) + "n^2 + " + ((x * y) + (w * z)) + "n " + (x * z);
		} else {
			return (w * y) + "n^2 + " + ((x * y) + (w * z)) + "n + " + (x * z);
		}
		
	}
	//check if a number is divisible
	public static boolean isDivisibleBy (int x, int y){
			if ((x % y) != 0){
				return false;
				}
			else {	
		return true;
		}
	}
	//find the absolute value of a number
	public static double absValue (double x){
			if (x > 0){
				return x;
				}
			else {
		return  x * (-1);
		}
	}
	//find the biggest number out of 2 #
	public static int max (int x, int y){
		if (x > y){
			return x;
			}
		else {
	return y;		
	}
}
	//find the biggest # out of 3
	public static int max (int x, int y, int z){
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
	//find the smallest #
	public static int min (int x, int y){
		if (x < y){
			return x;
			}
		else {
	return y;		
	}
	}
	//round a number to 2 decimal places
	public static double round2 (double x){
		return (int)(100 * (x + .005))/100; 
	}
	//x^y
	public static double exponent(double x, int y){
		{
		    double result = 1;

		    if (y < 0) {
		       x = 1.0 / x;
		       y = -y;
		    }

		    for (int  i = 0; i < y; i++) {
		        result = result * x;
		    }

		    return result;
		}
	}
	//!x, or the number counts down and multiplies itself
	public static int factorial(int x){
			for (int i = (x-1); i <= x && i > 0; i-- )
				x *= i;
			return x;
			}
	//check if a # is prime
	public static boolean isPrime(int x){
			for(int i = 3; i * i <= x; i +=2)
				if (isDivisibleBy(x, i) == true) 
					return false;
				return true;
			}
	
	// the GCF of a number
	public static int greatestCommon(int a, int b){
	    int x = (max(a,b) - min(a,b));
	    return x;
		}

	//square root
	public static double sqrt(double x){
		double t;
		double squareRoot = x/2;
			do {
				t= squareRoot;
				squareRoot = (t + (x / t)) / 2;
			} while ((t-squareRoot) != 0);
			return squareRoot;
		}
	//the quadratic formula
	public static String quadForm(double a, double b, double c){
		 double plus = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
	     double minus = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
	     if (discriminant(a, b, c) < 0){
	    	 return (String)("no real roots");
	     }
	     else if (discriminant(a, b, c) == 0){	 
	    	 return (String)("only one real root");
	     }
	     else if (plus > minus){
	    	 return (String)(minus + " and " + plus);
	    	 }
	    	 else
	    	 {
	    		 return (plus + " and " + minus);
	    	 }
	     } 
	}

