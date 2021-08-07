one:
 Scanner sin=new Scanner(System.in);
	    int bal=sin.nextInt();
	    int lab=bal/2,flag=0;
	    if(bal==0||bal==1)
	    {
	        System.out.println(bal+" is Prime number");
	    }
	    else
	    {
	        for(int i=2;i<=lab;i++)
	        {
	            if(bal%i==0)
	            {
	                System.out.println(bal+" Not a Prime number");
	                flag=1;
	                break;
	            }
	        }
	        if(flag==0)
	        {
	            System.out.println(bal+" is Prime number");
	        }
	    }

sec:
Scanner sin=new Scanner(System.in);
	    int bal=sin.nextInt();
	    int lab=bal/2;
	    boolean flag=false;
	    
	        for(int i=2;i<=lab;i++)
	        {
	            if(bal%i==0)
	            {
	                System.out.println(bal+" Not a Prime number");
	                flag=true;
	                break;
	            }
	        }
	        if(!flag)
	        {
	            System.out.println(bal+" is Prime number");
	        }
	        else
	        {
	            System.out.println(bal+" is not Prime number");
	        }