package com.Java;

public class stringsBasics {
	//check edit form git hub
	public static void main(String[] args) {
		// declaring using string literal
		String s = "LearningJava";// saved inside the string constant pool under heap memory area.
		// declaring a string using new operator
		String Str2 = new String("LearningJava");//pointing out to the address which is outside the string constant pool
		System.out.println(Str2.intern());
		// Returns the number of characters in the String.
		System.out.println("String length = " + s.length());
		
		// Returns the character at ith index.
		System.out.println("Character at 5th position = " + s.charAt(5));

		String str = "5467&84";
		
		String[] arr=str.split("&"); 
		for (String w : arr) {  
            System.out.println(w);  
        }  
		
		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring  = " + s.substring(2, 5));

		// Concatenates string2 to the end of string1.
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string  = " + s1.concat(s2));
		System.out.println("Concatenated string  = " + s1+s2);
		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a  = " + s4.indexOf('a', 3));

		// Checking equality of Strings
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality  " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality  " + out);

		out = "Geeks".equalsIgnoreCase("gEeks ");
		System.out.println("Checking Equality " + out);

		// If ASCII difference is zero then the two strings are similar
		int out1 = s1.compareTo(s2);
		System.out.println("the difference between ASCII value is=" + out1);
		// Converting cases
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());

		// Converting cases
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + word2.toUpperCase());

		// Trimming the word
		//it removes the only empty spaces from begining and end of the string but not removes 
		//the empty spaces in between
		String word4 = " Learn Share     Learn ";
		System.out.println("word4 length:"+ word4.length());
		System.out.println("Trim the word " + word4.trim());
		System.out.println("length after trim: " + word4.trim().length());
		// Replacing characters
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = str1.replace("for", "gor");
		System.out.println("Replaced f with g -> " + str2);
		
		System.out.println("s hash code :"+s.hashCode());
		System.out.println("str2 hash code :"+Str2.hashCode());
		
	}

}
