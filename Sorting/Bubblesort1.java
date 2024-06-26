package Sorting;

public class Bubblesort1 {
public static void main(String[] args) {
int[]a= {2,3,78,56,34,98};
int b=a.length-1;
for(int i=b;i>0;i--) {
	for(int j=0;j<i;j++) {
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for (int i : a) {
System.out.print(i+" ");	
}
}
}
