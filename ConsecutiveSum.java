
public class ConsecutiveSum {

	static int consecutive(long num)
	{
		 int total = 0;
	        for (int L = 1; L * (L + 1) < 2 * num; L++)
	        {
	            float a = (float) ((1.0 * num-(L * (L + 1)) / 2) / (L + 1));
	            if (a-(int)a == 0.0) 
	                total++;        
	        }
	        System.out.println(total);
	        return total;
		
	}
	
	
	
	public static void main(String[] args) {
		
      long s=Integer.parseInt(args[0]);
      ConsecutiveSum.consecutive(s);
	}

}
