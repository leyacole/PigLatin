import java.util.Scanner;

public class conPigLatin {
	
	//public enum Vowels {a, e, i, o, u}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();
		
		String userPhrase = " ";
		
		String word = prompt(userPhrase);
		String lowWord = lowCase(word);
		String pigLatin   = convert(lowWord);
		System.out.println(pigLatin);
		
				
	}
	
	public static String prompt(String a) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a line to be translated: ");
		String userPhrase = scnr.nextLine();
			    		
		return userPhrase;
		
	}
	
	public static String lowCase(String lowWord) {
		
		lowWord = (lowWord.toLowerCase());		
		System.out.println(lowWord.toLowerCase());
		return lowWord;
		
	}
	
	public static String convert(String lowWord) {
		    
		String atEndWay = "way";
		String atEndAy= "ay";
		String alteredString = " ";
		String consonant = " ";
		String pigLatVowel;
		String pigLatCons;
		int consonantString;
		
			for (int i=0; i < lowWord.length(); i++) {
		
				if(lowWord.charAt(i) == 'a'|| lowWord.charAt(i) == 'e'|| lowWord.charAt(i) == 'i' || 
						lowWord.charAt(i) == 'o' || lowWord.charAt(i) == 'u') {
									
			       break;
				}
			
			   else if ((lowWord.charAt(i) != 'a'|| lowWord.charAt(i) != 'e'|| lowWord.charAt(i) != 'i' || 
					     lowWord.charAt(i) != 'o' || lowWord.charAt(i) != 'u')) { 
					    consonant = consonant + lowWord.substring(i, i + 1);
				
				}  
		  }
			consonant = consonant.substring(1);
			consonantString = consonant.length();
			
			if (consonantString > 0) {
				alteredString = lowWord.substring(consonantString);
				pigLatCons = (alteredString + consonant + atEndAy);
				return pigLatCons;
			}
			else {
				pigLatVowel = lowWord + atEndWay;
				return pigLatVowel;
			}
			
		
		}
	}

		
		

	
	


	
