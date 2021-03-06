import java.util.Date;
import java.util.Calendar; //ch2
import java.text.SimpleDateFormat; //ch2
import java.util.ArrayList; //ch3
import java.util.Iterator; //ch3
public class Main {
	public static void main(String[] args){
		//chr3
		System.out.println("***ch3-Q2***");
		Hero h1 = new Hero("Saito");
		Hero h2 = new Hero ("Suzuki");
		
		ArrayList<Hero> heros = new ArrayList<Hero>();
		heros.add(h1);
		heros.add(h2);
		for (Hero h : heros){
			System.out.println(h.getName());
		}
		
		System.out.println("******");
		
	 	/*
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Date> dates = new ArrayList<Date>();
		ArrayList<Hero> heros = new ArrayList<Hero>();
		ArrayList<Integer> ints = new ArrayList<Integer>();
		*/
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(20);
		points.add(100);
		
		for (int i : points){			
			System.out.println(i);
		}
		ArrayList<String> greetings = new ArrayList<String>();
		greetings.add("Good Morning");
		greetings.add("Good Afternoon");
		greetings.add("Good Night");
		for (int i = 0; i< greetings.size(); i++){
			System.out.println(i + ":" + greetings.get(i));
		}
		for (String greeting: greetings){
			System.out.println(greeting);
		}
		greetings.add(1, "Hello");
		for (int i = 0; i< greetings.size(); i++){
			System.out.println(i+ ":" + greetings.get(i));
		}
		greetings.remove(1);
		for (int i = 0; i< greetings.size(); i++){
			System.out.println(i+ ":" + greetings.get(i));
		}
		greetings.set(1,"Hello");
		for (int i = 0; i< greetings.size(); i++){
			System.out.println(i+ ":" + greetings.get(i));
		}
		/*Iterator*/
		Iterator<Integer> it = points.iterator();
		while (it.hasNext()){
			int point =it.next();
			System.out.println(point);
		}
		System.out.println("\n****Chr2***");
		Date now = new Date();
		System.out.println(now); //Tue Sep 05 22:35:21 PDT 2017
		System.out.println(now.getTime()); //1504676258535
		
		
		Date past = new Date(1316622225935L);
		System.out.println(past);//Wed Sep 21 09:23:45 PDT 2011
		
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime); //1504756146466
		
		
		
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
