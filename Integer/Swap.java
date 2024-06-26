package Integer;
import java.util.Scanner;
public class Swap {
	Scanner im =new Scanner(System.in);	
	int a=im.nextInt();
	int b=im.nextInt();
	int temp=0;
public void tempo() {
	System.out.println("Before Swap---"+a+"----"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After Swap---"+a+"----"+b);
}
public void perf() {
System.out.println("Before Swapping");
System.out.println(a+"---"+b);
    a=a+b;
	b=a-b;
	a=a-b;
System.out.println("After Swapping");	
System.out.println(a+"---"+b);
}
	public static void main(String[] args) {
Swap s=new Swap();
s.perf();


}
}
