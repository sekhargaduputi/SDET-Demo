package ArrayPrograms;

public class Stringmethods {

	public static void main(String args[]){
		
		String s="sekhar";
		String s1="chandu";
		
		
		System.out.println(s.length()); // Length
		System.out.println(s.concat(s1)); // joining to srting
		
		String g="              sekhar         ";  
		System.out.println(g.trim());  //remove space
		
		// char
		String f="Welcome";
		System.out.println(f.charAt(2));// Char
		
		//Contains
		String G="Welcome";
		System.out.println(G.contains("Welcome"));// true
		System.out.println(G.contains("welcome"));//false
		System.out.println(G.contains("com"));// true
		
		//equals
		String d="Java";
		String l="selenium";
		
		System.out.println(d.equals("Java")); //true
		System.out.println(d.equals("java"));//false
		System.out.println(d.equals(l));//false
		
		//equalsignore
		
		System.out.println(d.equalsIgnoreCase("Java")); //true
		System.out.println(d.equalsIgnoreCase("java")); //true
		
		//Replace
		String p="Welcome to Java";
		String b="Welcome To java";
		
		System.out.println(p.replace('e', 'a'));//Walcoma
		System.out.println(p.replace("Java","Selenium" ));
		
		//substring
		String o="Welcome";
		System.out.println(o.substring(2,6));
		System.out.println(o.substring(0,4));
		
		//toLowerCase
		String r="WELCOME";
		System.out.println(r.toLowerCase());
		
		//Uper case
		
		String q="welcome";
		System.out.println(q.toUpperCase());
		


		
		
		
		
		
		
	}
}
