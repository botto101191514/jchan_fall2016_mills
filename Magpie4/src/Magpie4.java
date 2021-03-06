//Jason chan 10/16/16
//period 2
//magpie lab

public class Magpie4 {
//hi there
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	
//predetermined responses
	public String getResponse(String statement) 
	{
		statement = statement.trim();
		String response = "";
		// *blank*
		if (statement.length() == 0)
		{
			response = "try using the other keys";
		}
		//how it responds to no
		else if (findKeyword(statement, "no", 0) >= 0)
		{
			response = "well, thats a shame...";
		}
		//how it responds to parents 
		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0)
		{
			response = "tell me about your parents";
		}
		//how it responds to sister
		else if (findKeyword(statement, "sister", 0) >= 0)
		{
			 response = "she sounds pretty cool. ";
		}
		//how it responds to brother
		else if (findKeyword(statement, "brother", 0) >= 0)
		{
			response = "he sounds like a cool dude. ";
		}
		//how it responds to the word "know"
		else if (findKeyword(statement, "know", 0) >= 0)
		{
			response = "i dont know any info, go ask another bot";
		}
		//i want to <something>
		else if (findKeyword(statement, "I want to", 0) >= 0) 
		{
			response = transformIWantToStatement(statement);
		}
		//do you <something> me?
		else if (findKeyword(statement, "Do you", 0) >= 0) 
		{
			int psn = findKeyword(statement, "Do you", 0);
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
			response = transformDoYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		//i want you to <something> me
		else if (findKeyword(statement, "I want you", 0) >= 0)
		{
			int psn = findKeyword(statement, "you", 0);
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		//i want <something>
		else if (findKeyword(statement, "I want", 0) >= 0)
		{
			response = transformIWantStatement(statement);
		}
		//i <something> you
		else if (findKeyword(statement, "I", 0) >= 0)
		{
			int psn = findKeyword(statement, "i", 0);
			if (psn >= 0  && findKeyword(statement, "you", psn + 2) >= 0) {
				response = transformISomethingYouStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
//prerecorded messages
	
	//i want to ""
	private String transformIWantToStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}
	
	//do you "" me
	private String transformDoYouMeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
	
		int psnOfDoYou = findKeyword(statement, "Do you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfDoYou - 3);
	
		String restOfStatement = statement.substring(psnOfDoYou + 6, psnOfMe).trim();
		return "i dont " + restOfStatement + " you.";
	}
	
	//i want you to "" me
	private String transformYouMeStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I want " + restOfStatement + " you?";
	}
	
	//i want ""
	private String transformIWantStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length());
		}
		int psn = findKeyword(statement, "I want ", 0);
		String restOfStatement = statement.substring(psn + 8).trim();
		return "Would you really be happy if you had " + restOfStatement + "?";
	}
	
	//I "" you
	private String transformISomethingYouStatement(String statement) {
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfYou = findKeyword (statement, "you", 0);
		String restOfStatement = statement.substring(psnOfYou - 6, psnOfYou - 1).trim();
		return "Why do you " + restOfStatement + " me?";
	}
	
//setting up a way to find specific keywords
	private int findKeyword(String statement, String goal, int startPos) {
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
	
//"i have no idea what to say so have these lines"
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