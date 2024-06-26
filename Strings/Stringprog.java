package Strings;

public class Stringprog {
public static void getchar(String s,int index,String s1) {
s=s.substring(0,index)+s1+s.substring(index+1);
System.out.println("Modified "+s);
}
public static void main(String[] args) {
	String s="Batman";
	getchar(s, 4, "sh");
}
}
