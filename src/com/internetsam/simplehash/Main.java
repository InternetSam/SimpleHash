package com.internetsam.simplehash;

public class Main {
	
	public static char[] alphabet = {'‡','¶','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9',' ','-','_','\'','.','?','#','\"','!',';',':','|','=','+','/','\\','(',')'};
	public static String input = "Insert the string you wish to hash! It must consist of the above characters.";
	public static char[] inputArray = input.toLowerCase().toCharArray();
	public static int hash = 0;
	
	public static void main(String[] args) {
		
		for(int y=0;y<inputArray.length;y++) {
			
			for(int x=0;x<alphabet.length;x++) {
				
				if(alphabet[x] == inputArray[y]) {
					
					hash = hash+x*x;

				}
			}
		}
		double hash1 = hash*hash+hash*hash*-128;
		System.out.printf("Hash: %.0f\n", hash1);
	}
}
