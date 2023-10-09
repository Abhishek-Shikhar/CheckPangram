package fog;

public class CheckPangram {
	
	    public static boolean isPangram(String input) {
	        // convert the input string to lowercase to make the check case-insensitive
	        input = input.toLowerCase();
	        
	        // create a boolean array to mark the presence of each letter in the alphabet
	        boolean[] alphabet = new boolean[26];
	        
	        // iterate through the input string and mark each letter as present in the alphabet array
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                alphabet[ch - 'a'] = true;
	            }
	        }
	        
	        // check if all letters in the alphabet are marked as present
	        for (boolean letterPresent : alphabet) {
	            if (!letterPresent) {
	                return false; 
	                // if any letter is missing, it's not a pangram
	            }
	        }
	        
	        return true; 
	        
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        boolean isPangramResult = isPangram(input);
	        
	        if (isPangramResult) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	}


