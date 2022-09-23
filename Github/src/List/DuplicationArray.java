package List;

import java.util.HashSet;

public class DuplicationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={10,29,39,40,40,20,39,29,29,29,29,12,12,34,45,5645,665,7,76,29};
		int count=0;
		HashSet b=new HashSet();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				b.add(a[i]);

			}
		}
		
		System.out.println(b);
	}

}
//if(a[i]==a[j]) {
//
//}