
public class PsychometricTesting {
	
	
	
	static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLomits)
	{
		int count=0;
		int[] offers=new int[lowerLimits.length];
	for(int j=0;j<lowerLimits.length;j++)
	{
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i]>=lowerLimits[j] && scores[i]<=upperLomits[j])
			{
				count++;
				
			}
		}
		offers[j]=count;
		count=0;
	}	
	for(int i=0;i<offers.length;i++)
	{
		System.out.println(offers[i]);
	}
	
		return offers;
		
	}

	public static void main(String[] args) {
		
		
		int l=0;
		int m=0;
		int n=0;
		int number_scores=Integer.parseInt(args[0]);
		int[] num_scores= new int[number_scores];
		int lower_queue_size=Integer.parseInt(args[number_scores+1]);
		int[] lower_queue= new int[lower_queue_size];
		int[] upper_queue= new int[lower_queue_size];
		for(int i=1;i<=number_scores;i++){
			num_scores[l]=Integer.parseInt(args[i]);
			l++;
		}
		
		int lower_score=number_scores+2;
		int lower_size=number_scores+lower_queue_size+1;
		for(int i=lower_score;i<=lower_size;i++){
			lower_queue[m]=Integer.parseInt(args[i]);
			m++;
		}
		
		
		int upper_queue_size=Integer.parseInt(args[lower_size+1]);
		int upper_size=lower_size+1;
		int upper_total_size=upper_size+upper_queue_size;
		for(int i=upper_size+1;i<=upper_total_size;i++){
			upper_queue[n]=Integer.parseInt(args[i]);
			n++;
		 }
		
	
		PsychometricTesting.jobOffers(num_scores, lower_queue, upper_queue);

	}

}
