
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
	}
	
}
