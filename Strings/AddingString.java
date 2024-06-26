package Strings;

public class AddingString {
public String join(String oldstr,String newstr,int index) {
	String str=new String();
for(int i=0;i<oldstr.length();i++) {
	str+=oldstr.charAt(i);
	if(i==index) {
		str+=newstr;	
	}
}
return str;
}
public static void main(String[] args) {
	AddingString st=new AddingString();
System.out.println(st.join("Hello World", "AI", 5));		

}
}
