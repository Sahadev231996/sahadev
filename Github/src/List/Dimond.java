package List;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		for(int i=0;i<=a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for( int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<a;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
