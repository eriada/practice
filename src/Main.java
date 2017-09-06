
public class Main {
	public static void main(String[] args){
		StringBuilder sb1_1 = new StringBuilder();
		for (int i = 1; i < 101;  i++){
			sb1_1.append(i).append(",");
		}
		
		String s1_1 = sb1_1.toString();
		String[] a = s1_1.split(",");
		for (String a1 : a){
			System.out.println(a1);
		}
		
		
		String s1 = "@@Java@@";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)){
			System.out.println("s2 and s3 are equal");
		}
		if (s2.equalsIgnoreCase(s3)){
			System.out.println("s2 and s3 are same if case is ignored");
		}
		System.out.println("length of s1 is " + s1.length());
		
		if (s1.isEmpty()){
			System.out.println("s1 is empty");
		}
		
		//Search for strings within a string		
		String s4 = "Java and JavaScript";
		String s5 = "Java";
		if (s4.contains(s5)){
			System.out.println("String s4 contains " + s5);
		}
		if (s4.endsWith(s5)){
			System.out.println("At the end of String s4 is " + s5);
		}
		System.out.println("At the location of first appearance of Java in S4: " + s4.indexOf(s5));
		
		System.out.println("At the location of last appearnace of Java in s4: " + s4.lastIndexOf(s5));
		
		//extract a string/char from a string
		//We used a lot
		String s6 = "Java programming";
		System.out.println("A string after 3 characters of s6: " + s6.substring(3));
		System.out.println("text between 3 ~ 8: " + s6.substring(3, 8));
		
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++){
			sb.append("Java");
		}	 
		//System.out.println(sb);
		String s7 = sb.toString();
		System.out.println(s7);
		
		//String is immutable
		//StringBuilder and StringBuffer is mutable
		
		String s8 = "abc,def:ghi";
		String regex = "[,:]";
		String [] words = s8.split(regex);
		for (String w: words){
			System.out.print(w + "->");
		}
		System.out.println("   ");
		
		String regex2 ="[beh]";
		String replacement = "X";
		String w2= s8.replaceAll(regex2, replacement);
		System.out.println(w2);
		
		
	}
	
	//pattern matching
	//regex = Regular Expression
	boolean isValidPlayerName(String name){
		String regex = "[A-Z] [A-Z0-9]{7}";
		return name.matches(regex);
	}

	
}
