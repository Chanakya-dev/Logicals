package Sorting;

public class Flagsort {
public static void main(String[] args) {
	int[]a= {2,3,56,78,43,23};
	int b=a.length-1;
	int count=0;
	for(int i=b;i>0;i--) {
//		boolean flag=false;
	    count++;
		for(int j=0;j<i;j++) {
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
//			flag=true;
		}
	}
//		if(flag==false) {
//			break;
//		}
	}
	System.out.println(count+" ");
for (int i : a) {
	System.out.print(i+" ");
}
}
}
