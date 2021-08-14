package Array;

public class npr1 {
	int a=10;
	
	public static void main(String[] args)
	{

	npr1 ob1=new npr1();
	npr1 ob2=new npr1();
	
	npr1[] a= {ob1,ob2};
	
	for (int i=0;i<a.length;i++)
	{
		System.out.println(a[i].a);
	}
	
	}

}
