package Integer;
import java.util.Scanner;
public class Fibonacci {
public void scan() {
	int a,b,c,d;	
	Scanner in=new Scanner(System.in);
	System.out.println("Give Your Number");
	a=in.nextInt();
	System.out.println("Give Sequential Number");
	b=in.nextInt();
	System.out.println("Give Your Count");
	d=in.nextInt();
	System.out.println("First Number"+a);
	System.out.println("Second Number"+b);
for(int e=0;e<d;e++) {
c=a+b;
System.out.print(c+",");
a=b;
b=c;
}
}	
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
f.scan();		


}
}
