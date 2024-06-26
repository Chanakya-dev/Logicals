package Arrays;

public class Matrixmulti {
public static void main(String[] args) {
	int[][] Mat1= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
	};
	int[][] Mat2= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
	};
	
	int rows=Mat1.length;
	//System.out.println(rows);
	int cols=Mat1[0].length;
	//System.out.println(cols);
	int [][]sum=new int[rows] [cols];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			sum[i][j]=Mat1[i][j]*Mat2[i][j];
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(sum[i][j]+" ");	
		}
		System.out.println(   );
	}
}


}
