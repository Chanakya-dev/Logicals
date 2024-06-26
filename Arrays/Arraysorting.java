package Arrays;

public class Arraysorting {
public void sortby(int[]a) {
	int b=a.length-1;
	for(int i=b;i>0;i--) {
//	7 >0 6
		for(int j=0;j<i;j++) {
//	0 <7 1	
		if(a[j]>a[j+1]) {
//		0 > 1 
		int temp=a[j];	
//		temp=0;
		a[j]=a[j+1];
//		0=1;	
		a[j+1]=temp;
//		1=0;
		}
	}}
}
public static void main(String[] args) {
	int []a= {23,34,56,21,90,2};
	Arraysorting as=new Arraysorting();
	as.sortby(a);
	for(int n:a) {
		System.out.print(n+" ");
	}
}
}
