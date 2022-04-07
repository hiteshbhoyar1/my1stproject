package practice;

public class Test1 {

	public static void main(String[] args) {
		String h= "abc";
		String k="xyz";
		String l="pqr";
		System.out.println(h.concat(k).concat(l));
		
		String a1="java,selenium,testng,mevan";
		String sep=",";
		String []s= a1.split(sep);
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]);
		}
		System.out.println(s[0]+ "\n" +s[1]+"\n"+s[2]+ "\n"+s[3] );
		
	}

}
