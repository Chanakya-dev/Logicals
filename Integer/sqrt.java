package Integer;
import java.util.Scanner;
public class sqrt {
	Scanner in=new Scanner(System.in);
public void sqert() {
	int a=in.nextInt();
	int temp=0;
	for(int i=0;i<=a/2;i++) {
		if(i*i==a) {
		temp=i;	
		}
	}
	System.out.println("Sqrt of"+a+"is"+temp);
}
public void cubert(){
float a= in.nextFloat();
	int temp=0;
	for(int i=0;i<a/2;i++) {
		if(i*i*i==a) {
		temp=i;	
		}
	}
	System.out.println(temp);
}
	public static void main(String[] args) {
sqrt s=new sqrt();
s.cubert();
}
}
