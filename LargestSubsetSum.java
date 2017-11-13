
public class LargestSubsetSum {
	
	
	static long[] maxSubsetsum(int[] k)
	{
		
		long[] a= new long[k.length];
		
		for(int j=0;j<k.length;j++)
		{
			
			
			int sum = 0;
			int N=k[j];
			int LIM = (int) Math.sqrt(N);
			for (int i = 1; i <= LIM; i++)
			{
				if (N % i == 0)
				{
					
					if (i == (N / i))
						sum += i;
					else
						sum += (i + N / i);
				}
			}
            System.out.println(sum);
			a[j]=sum;
			
		}
		
		
		return a;
	}
	
	
	
	

	public static void main(String[] args) {
		int[] a= new int[Integer.parseInt(args[0])];
		int k=0;
		if(args!=null)
		{
			
			for(int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				a[k]=Integer.parseInt(args[i]);
				k++;
			}
			
		}
		
		LargestSubsetSum.maxSubsetsum(a);
		

	}

}
