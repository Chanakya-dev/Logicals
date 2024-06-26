package Integer;
import java.util.Scanner;
public class Squares {

double a=2,b=2;
public void SQC() {
	Scanner in=new Scanner(System.in);
	System.out.println("Your Choice");
	String Choice=in.next();
	System.out.println("Count");
	int c=in.nextInt();
	if(Choice.contains("s")||Choice.contains("S")) {
	for(int d=0;d<=c;d++) {
		double	e=a*a;
		System.out.println(a+" x "+a+"  : "+e);
		a++;
		e=a;
	}
	}
else if(Choice.contains("C")||Choice.contains("c")) {
	for(int d=0;d<=c;d++) {
		double	e=a*a*a;
		System.out.println(a+" x "+a+" x "+a+" : "+e);
		++a;
		e=a;
	}	
	}
}
public void doubles() {
int c=10;
	for(int i=0;i<=c;i++) {
		double e=a*b;
		System.out.println(e);
		a=e;
	}}
public static void main(String[] args) {
	Squares s=new Squares();
s.SQC();
//	s.doubles();
}
}
