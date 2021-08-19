import java.util.*;
public class quesone 
{
	public static void main(String args[])
	{
		Scanner sin=new Scanner(System.in);
		String st=sin.next();
		int n=sin.nextInt();
		int count=0;
		
		 int N = st.length();
		 
		                                          // Initialize a prefix sum array
		  int []pref = new int[N];
		  
		                                          // Loop through the string to
		                                          // create the prefix sum array
		  for (int i = 0; i < N; i++)
		  {
		                                           // Store 1 at the index
		                                           // if it is a vowel
		    if (st.charAt(i) == 'a' ||
		        st.charAt(i) == 'e' ||
		        st.charAt(i) == 'i' ||
		        st.charAt(i) == 'o' ||
		        st.charAt(i) == 'u')
		      pref[i] = 1;
		 
		                                            // Otherwise, store 0
		    else
		      pref[i] = 0;
		 
		                                            // Process the prefix array
		    if (i != 0)
		      pref[i] += pref[i - 1];
		  }
		 
		                                            // Initialize the variable to store
		                                            // maximum count of vowels
		  int maxCount = pref[n - 1];
		 
		                                            // Initialize the variable
		                                            // to store substring
		                                            // with maximum count of vowels
		  String res = st.substring(0, n);
		
		                                            // Loop through the prefix array
		  for (int i = n; i < N; i++)
		  {
		                                            // Store the current
		                                            // count of vowels
		    int currCount = pref[i] -
		                    pref[i - n];
		  
		                                            // Update the result if current count
		                                            // is greater than maximum count
		    if (currCount > maxCount)
		    {
		      maxCount = currCount;
		      res = st.substring(i - n + 1,
		                          i + 1);
		    }
		 
		                                             // Update lexicographically smallest
		                                             // substring if the current count
		                                             // is equal to the maximum count
		    else if (currCount == maxCount)
		    {
		      String temp = st.substring(i - n + 1,
		                                  i + 1);
		 
		      if (temp.compareTo(res) < 0)
		        res = temp;
		    }
		  }
		  System.out.println(res);
		
	}

}
