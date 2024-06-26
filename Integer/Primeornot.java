package Integer;
import java.util.Scanner;
public class Primeornot {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter The Number");
	int a=in.nextInt();
	int temp=0;
	for(int i=2;i<a;i++) {
	if(a%i!=0) {	
		temp++;
	}
	else {
		System.out.println(i);
	}
	}
	
	if(temp==0) {
		System.out.println("Composite Numbers:"+a);
	}
	else {
		System.out.println("Prime Numbers:"+a);
	}
	
	
}
}
