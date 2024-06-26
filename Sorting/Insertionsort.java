package Sorting;

public class Insertionsort {
public static void main(String[] args) {
	int[]a= {34,45,32,12,2};
//	second elemen`t
	for(int i=1;i<a.length;i++) {
		int sort=a[i];
		int j=i-1;
		while(j>=0 && a[j]>sort) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=sort;
	}
	for (int i : a) {
		System.out.print(i+" ");
	}
}
}
