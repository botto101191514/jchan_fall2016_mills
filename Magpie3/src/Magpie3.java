public class Magpie3 {

	//Get a default greeting and return a greeting
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	
	/*
	 * 1) Copy and paste the code you wrote in Magpie 2 into the getResponse method
	 * 
	 * 2) Then *change* getResponse to use .findKeyword(String statement,String keyword) instead of .indexOf(String keyword)	 
	 *  
	 * 3) Copy and paste the 2 new noncommittal responses you wrote in part 2 into getRandomResponse();
	 * 
	 * 4) Use the code to complete the tracing in the handout.
	 * 
	 */

	/**
	 * Gives a response to a user statement
	 * takes in user statement
	 * response based on the rules given
	 */
	
	public String getResponse(String statement) {
		statement = statement.trim();
		String response = "";
		if (statement.length() == 0)
		{
			response = "try using the other keys";
		}
		else if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "whats the point in being so negative?";
		}
		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0)
		{
			response = "tell me about your parents";
		}
		else if (findKeyword(statement, "sister", 0) >= 0)
		{
			 response = "she sounds pretty cool. ";
		}
		else if (findKeyword(statement, "brother", 0) >= 0)
		{
			response = "he sounds like a cool dude. ";
		}
		else if (findKeyword(statement, "know", 0) >= 0)
		{
			response = "i dont know any info, go ask another bot";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no").
	 * 
	 * parameter: statement
	 *            the string to search
	 * parameter: goal
	 *            the string to search for
	 * parameter: startPos
	 *            the character of the string to begin the search at
	 * return the index of the first occurrence of goal in statement or -1 if
	 *         it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0) 
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0) 
			{
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) 
			{
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (before.equals(" ") && after.equals(" ")) 
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}
		return -1;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "What?";
		} else if (whichResponse == 4) {
			response = "Continue on...";
		} else if (whichResponse == 5) {
			response = "I didn't quite catch that.";
		}
		return response;
	}		
}
