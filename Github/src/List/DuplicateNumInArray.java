package List;

import java.util.HashSet;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,24,65,1,2,2,2,2,1,1,1,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9};
		HashSet s =new HashSet();
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
			
		}
		System.out.println(s);
	}

}
