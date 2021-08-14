package Array;

public class r1 {
	
	public static void main(String[] args)
	{
		int []a={10,20,30,40};
		
		for (int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
	 int []b = reverse(a);
	 
	 for (int i=0;i<b.length;i++)
	 {
		 System.out.println(b[i]+" ");
	 }
	}

	private static int[] reverse(int[] temp) {
		int[]temp1=new int[temp.length];
		for (int i=0,j=temp.length-1;i<temp.length;i++,j--)
		{
			temp1[j] = temp[i];
		}
		return temp1;
	}

}
