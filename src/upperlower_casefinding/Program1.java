package upperlower_casefinding;

public class Program1 {

	public static void main(String[] args) {
		String h="HiteshGOPalraoBhoyar";
		int cap=0;
		for(int i=0;i<h.length();i++) {
			char c=h.charAt(i);
			if(c>='A' && c<='Z')
				cap++;	
		}
		System.out.println("the count of uppercase letter are "+cap);
		System.out.println("the count of lowercase letter are "+(h.length()-cap));
	}

}
class program2{
	
	public static void main(String[] args) {
		String a="SanketAAAAPIdurKar";
		int cap1=0;
		for(int j=0;j<a.length();j++) {
			char d=a.charAt(j);
			if(d>='A' && d<='Z')
				cap1++;
		}
		System.out.println(cap1);
		System.out.println(a.length()-cap1);
	}
}
class program3{
	public static void main(String[] args) {
		
	
	String a1="MARUTISUZUKIisthebiggestcarMANUFACTURER";
	int cap2=0;
	for(int k=0;k<a1.length();k++) {
		char e=a1.charAt(k);
		if(e>='A'&&e<='Z')
			cap2++;
	}
	System.out.println(cap2);
	System.out.println(a1.length()-cap2);
	}
	
}
class program4{
	public static void main(String[] args) {
		String a2="TheTIGerIsTHeKIngOfTheJUNgle";
		int cap=0;
		for(int m=0;m<a2.length();m++) {
			char f= a2.charAt(m);
			if(f>='A'&&f<='Z')
				cap++;
		}
		System.out.println("the number of characters in uppercase is "+cap);
		System.out.println("the length of characters in lowercase is "+(a2.length()-cap));
	}
}
