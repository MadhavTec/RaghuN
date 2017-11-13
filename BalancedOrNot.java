
public class BalancedOrNot {
	
	
	
	static int[] balancedOrNot(String[] expressions, int[] MaxReplacments)
	{
		int less=0;
		int gre=0;
		int[] result=new int[expressions.length];
		for(int i=0;i<expressions.length;i++)
		{
			String s=expressions[i];
			
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='<')
				{
					less++;
					
				}  
				
				if(s.charAt(j)=='>'){
					gre++;
					
				} 
			}
			
			
           if(less==gre)
			{
        	   
        	for(int j=0;j<s.length();j=j+2)
   			{
        	   if(s.charAt(j)=='<' && s.charAt(j+1)=='>')
        	   {
        		   result[i]=1;
        		   
        	   } else {
        		   result[i]=0;
        		   
        	   }
   			}
        	
        	int p=s.length()/2;
        	if(p<=MaxReplacments[i])
        	{
        		result[i]=1;
        	}
			} 
           if(less>gre)
			{
				int less_result=less-gre;
				if(MaxReplacments[i]>=less_result)
				{
					result[i]=1;
				} else {
					result[i]=0;
				}
				
			} 
           if(less<gre)
           {
				int gre_result=gre-less;
				if(MaxReplacments[i]>=gre_result)
				{
					result[i]=1;
				} else {
					result[i]=0;
				}
			}
           
           
           less=0;
		   gre=0;
			
		}
		for(int i=0;i<result.length;i++)
		{
		System.out.println(result[i]);
		}
		return result;
		
		
	}
	
	
	  public static void main(String[] args) {
		
		String[] expression= new String[Integer.parseInt(args[0])];
		int replace_size=Integer.parseInt(args[0])+1;
		int[] maxReplacement= new int[Integer.parseInt(args[replace_size])];
		int k=0;
		int j=0;
		if(args!=null)
		{
			
			for(int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				expression[k]=args[i];
				
				k++;
				
			}
			
			for(int i=Integer.parseInt(args[0])+2;i<=args.length-1;i++)
			{
				maxReplacement[j]=Integer.parseInt(args[i]);
				
				j++;
			}
			
		}
		
		BalancedOrNot.balancedOrNot(expression, maxReplacement);

	}

}
