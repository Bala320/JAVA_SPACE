public class Main
{
	public static void main(String[] args) 
	{
	    int[] ar={1,1,1,1,2,2,3,3,5,5,4,4,6,6,9,9,8,8,7,7,10,10};
	    
	    for(int i=0;i<ar.length;i++)
	    {
	        int j;
	        for(j=0;j<i;j++)
	        {
	            if(ar[i]==ar[j])
	            {
	               
	                break;
	            }
	        }
	        if(i==j)
	        {
	             System.out.println(ar[i]);
	        }
	    }
	
	}
}
