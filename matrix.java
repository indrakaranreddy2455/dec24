package oopsDemo;

public class matrix {

	public static void main(String[] args) {
		
		int[][] mat= {
				{1,2,3,33,34,56,76},
				{3,4,5,47,43},
				{6,7,8,4,53,56,78,8}
		};
		
		for(int rows=0;rows<3;rows++) {
			for(int cols=0;cols<mat[rows].length;cols++) {
				System.out.print(mat[rows][cols]+" ");
			}
			System.out.println();
		}
		
	}

}
