package oopsDemo;

public class accumulateno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=9999,r,sum=0;
		//9+9+9+9----36--3+6----9
		
		while(num !=0) {
			r = num % 10;
			num = num /10;
			sum=sum+r;
			if(sum==0) {
				if(sum>=10){
					num=sum;
					sum=0;
				}
			}
			
		}
		
		System.out.println("sum--->"+sum);
	}

}
