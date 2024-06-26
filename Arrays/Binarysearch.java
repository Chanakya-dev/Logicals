package Arrays;

public class Binarysearch {
	
public static void main(String[] args) {
int num=4;
int []a= {1,2,3,4,5};
int b=a.length;
for(int i=0,high=b-1;i<=high;) {
	int sum=i+high/2;
	if(a[sum]==num) {
		System.out.println(sum);
		break;
	}
	else if(a[sum]<num) 
		 {
			i=sum+1;
		  }
		else 
		{
			high=sum+1;
		}
	}
}
}
