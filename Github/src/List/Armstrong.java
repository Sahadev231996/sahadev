package List;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int a1=a;
		int n=0;
		int a2=a;
		int sum=0;
		while(a1>0) {
			a1=a1/10;
			n++;
		}
		while(a2>0) {
			int b=a2%10;
			sum=(int) (sum+Math.pow(b, n));
			
			a2=a2/10;
			
		}
		if(a==sum) {
			System.out.println("the number is armstrong");
		}
		else {
			System.out.println("The number is not armstrong");
		}
	}

}
