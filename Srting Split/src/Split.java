public class Split 
{
	public static void main(String[] args){
		apples("i like apples");
		bread("applespineapplesbreadlettustomatobaconmayobreadhamcheese");
	}
public static void apples(String statement){
	String[] split = statement.split(" ");
	System.out.println("[" + "\"" + split[0] + "\"" + "," +  "\"" + split[1] + "\"" + "," + "\"" + split[2] + "\"" + "]");
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
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
public static void bread(String statement){
	String[] split = statement.split("bread");
	if(findKeyword(statement, "bread", 0) == 2){
		System.out.println(split[1]);
	}
	else {
		System.out.println("thats not a sandwich");
	}
}
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
private static int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		while (psn >= 0) {
			String before = " ", after = " ";
			if (psn > 0) {
			before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
					psn + goal.length() + 1).toLowerCase();
			}
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return -1;
	}
}
		



