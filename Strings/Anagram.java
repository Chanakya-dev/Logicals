package Strings;

import java.util.Arrays;

public class Anagram {
public static boolean ang(String str,String str1) {
	str1=str1.replaceAll(" ", "").toLowerCase();
	str=str.replaceAll(" ", "").toLowerCase();
	int n1=str.length();
	int n2=str1.length();
	if(n1!=n2) {
		return false;
	}
	char[]s=str.toCharArray();
	char[]s1=str.toCharArray();
	Arrays.sort(s);
	Arrays.sort(s1);
	for(int i=0;i<n1;i++) {
		if(s[i]!=s1[i]) {
			return false;
		}
	}
	
	
	return true;
	
}
public static void main(String[] args) {
//	char str[]= {'c','a','r'};
//	char str1[]= {'r','a','c'};
String str="Listen";
String str1="Silent";
	System.out.println(ang(str, str1));
}
}
