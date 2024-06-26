package Arrays;

public class Arrayreverse {
	public void reverse(int[]a) {
	int length=a.length;
	for(int i=0;i<length/2;i++) {
//		temp=2
		int temp=a[i];
//		2=a[8-0-1]
//		2=7
		a[i]=a[length-i-1];
//		7=2;	
		a[length-i-1]=temp;
	}
	
	}
	public void Arraysort() {
		
	}
	
public static void main(String[] args) {
	int[]a= {2,3,4,5,6,7,8,9};
	for(int h:a) 
	{
		System.out.print(h+",");
		
	}
	System.out.println();
Arrayreverse b=new Arrayreverse();
b.reverse(a);
for(int num:a) {
	System.out.print(num+",");
}
	
}
	
}
