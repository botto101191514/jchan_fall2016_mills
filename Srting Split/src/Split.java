import java.util.Arrays;

public class Split 
{
	public static void main(String[] args)
	{
		apples("i like apples");
		splitReally("I really like really red apples");
		bread("applespineapplesbreadlettustomatobaconmayobreadhamcheese");
		breadWSpaces("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}

	
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
	public static void apples(String statement)
	{
		String[] split = statement.split(" ");
		System.out.println(Arrays.toString(split));
		}
	public static void splitReally(String statement)
	{
		String[] split = statement.split("really ");
		System.out.println(Arrays.toString(split));
	}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static void bread(String statement){
		if(statement.indexOf("bread") >= 0){
			String[] split = statement.split("bread");
			System.out.println(split[1]);
		}
		else 
		{
			System.out.println("thats not a sandwich");
		}
	}

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static void breadWSpaces(String statement){
		if (statement.indexOf("bread") > 0){
			String[] split = statement.split("bread");
			String statement2 = split[1];
			statement2 = statement2.trim();
			String[] split2 = statement2.split(" ");
			System.out.println(Arrays.toString(split2));
		}
		else
		{
			System.out.println("not a sandwich");
		}
		
	}
}
