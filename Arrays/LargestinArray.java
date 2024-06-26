package Arrays;

public class LargestinArray {
public static void main(String[] args) {
	int[] a= {2,89,78,67,5,9,7};
int Large=a[0];
int Small=a[0];
	for(int i=0;i<a.length;i++) {
if(a[i]>Large) {
	Large=a[i];
}
else if(a[i]<Small) {
	Small=a[i];
}
}
	System.out.println("Largest in Array "+Large);
	System.out.println("Smallest in Array "+Small);
}
}
