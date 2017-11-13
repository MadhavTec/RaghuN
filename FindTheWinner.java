
public class FindTheWinner {
	
	
	static String Winner(int[] andrea, int[] maria, String s)
	{
		
		int ara=0;
		int mar=0;
		if(s.equals("Even"))
		{
			for(int i=0;i<andrea.length;i=i+2)
			{
				int and_result=andrea[i]-maria[i];
				int mar_result=maria[i]-andrea[i];
				ara=and_result+ara;
				mar=mar_result+mar;
			}
			
			if(ara>mar)
			{
				System.out.println("andrea");
				return "andrea";
			} else if(ara==mar) {
				System.out.println("tie");
				return "tie";
			} else {
				System.out.println("maria");
				return "maria";
			}
			
		}
		
		if(s.equals("Odd"))
		{
			for(int i=1;i<andrea.length;i=i+2)
			{
				int and_result=andrea[i]-maria[i];
				int mar_result=maria[i]-andrea[i];
				ara=and_result+ara;
				mar=mar_result+mar;
			}
			
			if(ara>mar)
			{
				System.out.println("andrea");
				return "andrea";
			} else if(ara<mar) {
				System.out.println("maria");
				return "maria";
			} else {
				System.out.println("tie");
				return "tie";
			}
			
		}
		return "enter proper result";
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int[Integer.parseInt(args[0])];
		int[] m= new int[Integer.parseInt(args[0])];
		int k=0;
		int p=0;
		
		if(args!=null)
		{
			
			for(int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				a[k]=Integer.parseInt(args[i]);
				k++;
				
			}
			
			for(int i=Integer.parseInt(args[0])+2;i<=args.length-2;i++)
			{
				m[p]=Integer.parseInt(args[i]);
				p++;
				
			}
			
		}
		
		FindTheWinner.Winner(a, m, args[args.length-1]);
		
		
	}

}
