package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String solution="";
		

		for(int i=0;i<input.length();i++){
		for(int j=0;j<3;j++) {
		solution=solution+input.charAt(i);
			
			}
		}
		
		
		return solution;
        
		}
	
		
	
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
			
 String theStuffBetweenTheBerts = "";
 boolean haveISeenABert = false;
 for(int i=0;i<= input.length();i++) { //looping over the entire string
				
 if(i > input.length() - 4 
 && haveISeenABert) {
 theStuffBetweenTheBerts = "";
 break;
}
				
if(input.toLowerCase().substring(i,i+4).equals("bert")) { //is the substring bert?
					
if(!haveISeenABert) {
haveISeenABert = true;
} else {
break;
}
					
i = i + 4; //skipping to after bert
					
theStuffBetweenTheBerts = theStuffBetweenTheBerts + input.charAt(i); //start recording the letters
					
} else {
					
if(haveISeenABert) {		
theStuffBetweenTheBerts = theStuffBetweenTheBerts + input.charAt(i);
}
				
}
	
	}
	
	
	String theStuffReversed = "";
	for(int i = 0; i <= theStuffBetweenTheBerts.length() - 1; i++) {
		theStuffReversed = theStuffReversed + theStuffBetweenTheBerts.charAt(theStuffBetweenTheBerts.length() - 1 - i);
	}
	
	
	return theStuffReversed;

}


	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {	
			
			 int theMax = Math.max(Math.max(a,b),c);
			 
			 int theMin = Math.min(Math.min(a, b),c);
			 
			 int theMedium = 0;//Integer.MIN_VALUE;
			 
			 if(theMax != a && theMin != a) {theMedium = a;}
			 if(theMax != b && theMin != b) {theMedium = b;}
			 if(theMax != c && theMin != c) {theMedium = c;}
			 		 
			 return theMax - theMedium == theMedium - theMin;		
		}


	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		return "";
	
	}
	
	

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
					
			return input.toLowerCase().endsWith("dev");
			

	}
	


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
      		
      		if(input.isEmpty()) {return input.length();}
      		
      		int largestBlockCount = 0;
      		char currentCharacter = input.charAt(0);
      		int currentBlockCount = 0;
      		for(int i = 0; i < input.length() - 1; i++) {
      			
      			if(input.charAt(i) == currentCharacter) {
      				currentBlockCount++;
      			} else {
      				largestBlockCount = Math.max(currentBlockCount,largestBlockCount);
      				currentBlockCount = 1;
      			}
      			
      			currentCharacter = input.charAt(i);
      			   			
      		}

        	return largestBlockCount;
		}

	
//		return -1;

	//}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		

    		
    		String lowerCase = arg1.toLowerCase();
    		int amCounts = 0;
    		for(int i = 0; i <= lowerCase.length() - 3; i++) {
    			
    			if(i == 0 && lowerCase.substring(i, i+4).equals("am ")) {amCounts++;}
    			
    			if(i <= lowerCase.length() - 5 && lowerCase.substring(i, i+4).equals(" am ")) {amCounts++; }
    			
    			if( i ==  lowerCase.length() - 4 && lowerCase.substring(i, i+4).equals(" am")) {amCounts++; }
 
    		}

    		return amCounts;
    		
    	}
	
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
public String fizzBuzz(int arg1) {
		

		
    	
    	if(arg1 %5 == 0 && arg1%3 == 0) {
    		return "fizzbuzz";
    	}
    	
    	if (arg1%3==0) {
    		return "fizz";
    	}
    	if(arg1%5==0) {
    		return "buzz";
    	}
    	else {
    	
    		return "IAmInOfflinexercisesClass";
    		
    	}

    			
    	}
}

	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	//blic int largest(String arg1) {
	//eturn 0;
		
		
		
	
	
	
	//
