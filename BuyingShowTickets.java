
public class BuyingShowTickets {

	static long waitingTime(int[] tickets,int p)
	{
		int[] positions=new int[tickets.length];
		
		int total_tickets=0;
		int time=0;
		int ram=0;
		for(int j=0;j<tickets.length;j++)
		{
			positions[j]=j;
		}
		
		for(int i=0;i<tickets.length;i++)
		{
			int tem=tickets[i];
			total_tickets=total_tickets+tem;
		}
	for(int k=0;k<tickets.length;k++)
	 {	
		for(int j=0;j<tickets[k];j++)
		{
			
		
		   for(int i=0;i<tickets.length;i++)
		    {
			
			if(tickets[i]!=0)
			{
				if(tickets[p]==0)
				{
					break;
				}
				
				ram=tickets[i];
				tickets[i]=--ram;
				time++;
				
			}
			
		    }
		
		}
	
	 }
		System.out.println(time);
		
		return p;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int tickets=Integer.parseInt(args[0]);
		int t_position=Integer.parseInt(args[args.length-1]);
		int[] a= new int[tickets];
		int k=0;
		for(int i=1;i<=tickets;i++)
		{
			a[k]=Integer.parseInt(args[i]);
		    k++;
			
		}

		
		BuyingShowTickets.waitingTime(a, t_position);
	}

}
