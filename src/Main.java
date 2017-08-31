
public class Main {
	public static void main(String[] args){
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
			
	}
	
}
