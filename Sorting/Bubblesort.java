package Sorting;

public class Bubblesort {
public static void main(String[] args) {
int[]a= {23,34,56,67,2,3};
for (int i : a) {
	System.out.print(i+" ");
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length-i-1;j++) {
/*The inner loop condition j<a.length-i-1 ensures that the inner 
	loop only iterates over the unsorted part of the array. 
	As i increases with each iteration of the outer loop, 
	the number of elements in the unsorted part decreases.*/
if(a[j]>a[j+1]) {
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;	
}
}
}
System.out.println();
for(int i:a) {
	System.out.print(i+" ");
}
}
}
