
public class InTheFuture {
	
	static int minNum(int a,int k,int p)
	{
		int ext_date=0;
		if(a+p>k)
		{
			ext_date=a+p-k;
		} else if(a+p<k)
		{
			ext_date=1;
		} else {
			ext_date=2;
		}
		
		
		return ext_date;
		
	}
	

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int k=Integer.parseInt(args[1]);
		int p=Integer.parseInt(args[2]);
		
		
		System.out.println(InTheFuture.minNum(a, k, p));
		
	}

}
