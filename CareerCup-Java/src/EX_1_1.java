
//Implement an algorithm to determine 
//if a string has all unique characters. 
//What if you can not use additional data structures?

public class EX_1_1 {
	
	public static boolean isUniqueChars2(String str){
		
		boolean [] char_set = new boolean [256];
		
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = isUniqueChars2("abcd");//true
		boolean b2 = isUniqueChars2("abcc");//false, "c" is not unique
		
		return;
	}

}
