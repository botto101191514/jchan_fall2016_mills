package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner input = new Scanner(System.in);
    	int inputNums = 1;
    	while (inputNums < inputNums + 1)
    	{
    		System.out.println("please enter an equation in the form of: x + y");
    		String inputAnswer = input.next();
    		if (inputAnswer == "quit")
    		{
    			input.close();
    			System.exit(0);
    		}
    		else 
    		{
    			inputAnswer = inputAnswer.trim();
           		System.out.println(produceAnswer(inputAnswer));
    		}
    	}
    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] value = input.split(" ");
        System.out.println(value.length);
        String values1 = value[0];
        String values2 = value[2];
        String operator = value[1];
        String frac1 = parseFrac(values1);
        String frac2 = parseFrac(values2);
        int denom1 = getDenom(frac1);
    	int numer1 = getNumer(frac1);
    	int denom2 = getDenom(frac2);
    	int numer2 = getNumer(frac2);
        if (operator == "+")
        {
        	String sum = sum(numer1, denom1, numer2, denom2);
        	return parseAnswer(sum);
        }
        else if (operator == "-")
        {
        	String diff = diff(numer1, denom1, numer2, denom2);
        	return parseAnswer(diff);
        }
        else if (operator == "*")
        {
        	String product = product(numer1, denom1, numer2, denom2);
        	return parseAnswer(product);
        }
        else if (operator == "/")
        {
        	String divide = divide(numer1, denom1, numer2, denom2);
        	return parseAnswer(divide);
        }
        else 
        {
        	System.out.println("invalid input");
        }
        return "";
    }
   
    // TODO: Fill in the space below with any helper methods that you think you will need
   
    public static String sum(int numer1, int denom1, int numer2, int denom2)
    {
    	if (denom1 != denom2)
    	{
    		numer1 = numer1 * denom2;
    		numer2 = numer2 * denom2;
    		int denom = denom1 * denom2;
    		int numer = numer1 + numer2;
    		return numer + "/" + denom; 
    	}
    	else
    	{
    		int numer = numer1 + numer2;
    		return numer + "/" + denom1; 
    	}
    }
 
    public static String diff(int numer1, int denom1, int numer2, int denom2)
    {
    	if (denom1 != denom2)
    	{
    		numer1 = numer1 * denom2;
    		numer2 = numer2 * denom2;
    		int denom = denom1 * denom2;
    		int numer = numer1 - numer2;
    		return numer + "/" + denom; 
    	}
    	else
    	{
    		int numer = numer1 - numer2;
    		return numer + "/" + denom1; 
    	}
    }
    
    public static String product(int numer1, int denom1, int numer2, int denom2)
    {
    	int denom = denom1 * denom2;
    	int numer = numer1 * numer2;
    	return numer + "/" + denom; 
    }
    
    public static String divide(int numer1, int denom1, int numer2, int denom2)
    {
    	int placeholder = numer2;
    	numer2 = denom2;
    	denom2 = placeholder;
    	int denom = denom1 * denom2;
    	int numer = numer1 * numer2;
    	return numer + "/" + denom; 
    }
    public static String negCheck(String fraction)
    {
    	int numer = getNumer(fraction);
    	int denom = getDenom(fraction);
    	String negFrac = "-" + numer + "/" + denom;
    	String posFrac = numer + "/" + denom;
    	if (denom > 0 && numer < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negFrac;
    	}
    	else if (denom < 0 && numer > 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return negFrac;
    	}
    	else if (denom < 0 && numer < 0)
    	{
    		absValue(denom);
    		absValue(numer);
    		return posFrac;
    	}
    	else
    	{
    		return posFrac;
    	}
    }
    
    public static String parseFrac(String fraction)
    {
    	int denominator = getDenom(fraction);
    	int numerator = getNumer(fraction);
    	int whole = getNumer(fraction);
    	if (denominator == 0)
    	{
    		System.out.println("ERROR: denominators != 0");
    	}
    	else if (denominator == 1)
    	{
    		numerator = whole + numerator;
    	}
    	else if (whole > 0)
    	{
    		String newImproperFrac = toImproperfraction(whole, numerator, denominator);
    		parseFrac(newImproperFrac);
    	}
    	return numerator + "/" + denominator;
    }
    
    public static String parseAnswer(String fraction)
    {
    	int denominator = getDenom(fraction);
    	int numerator = getNumer(fraction);
    	int simplify = gcf(numerator, denominator);
    	numerator = numerator / simplify;
    	denominator = denominator / simplify;
    	if (numerator > denominator)
    	{
    		String frac = toMixedNum(numerator, denominator);
    		return frac;
    	}
    	else
    	{
    		return numerator + "/" + denominator;
    	}
    }
    public static int absValue (int x){
		if (x > 0)
		{
			return x;
		}
		else 
		{
			return  x * (-1);
		}
	}
	public static int getWhole(String fraction)
	{
		if (fraction.indexOf("_") > 0)
		{
			int whole = Integer.valueOf(fraction.substring(fraction.indexOf("_") - 1));
			return whole;
		}
		else
		{
			int whole = 0;
			return whole;
		}
	}
	public static int getNumer(String fraction)
	{
		if (fraction.indexOf("/") > 0)
		{
			int numerator = Integer.valueOf(fraction.substring(0, fraction.indexOf("/")));
			return numerator;
		}
		else 
		{
			int numerator = 0;
			return numerator;
		}
	}
	public static int getDenom(String fraction)
	{
		if (fraction.indexOf("/") > 0)
		{
			int denominator = Integer.valueOf(fraction.substring(fraction.indexOf("/") + 1));
			return denominator;
		}
		else
		{
			int denominator = 1;
			return denominator;
		}
	}
	public static String toMixedNum(int x, int y){
		if (x % y != 0 && x > y)
		{
			return ((x / y) + "_" + (x % y) + "/" + y );
		}
		else
		{
			int divide = x / y;
			String ans = String.valueOf(divide);
			return ans;
		}
	}
    
    public static String toImproperfraction(int x, int y, int z) 
    {
		return ((z * x) + y) + "/" + z;
    }
    public static int gcf(int a, int b)
    {
    	if (a > b)
    	{
    		int x = a - b;
    		return x;
    	}
    	else
    	{
    		int x = b - a;
    		return x;
    	}
	}
}
