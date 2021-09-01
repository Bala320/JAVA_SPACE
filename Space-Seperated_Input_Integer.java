Scanner scan = new Scanner(System.in);
		System.out.println();
		int i;
		 int a[]=new int[100];
		 String s[]= scan.nextLine().split(" ");
		 
		for(i =0 ;i < s.length;i++)
		{
		 a[i]= Integer.parseInt(s[i]);
		}
		
		for(i =0 ;i < s.length;i++)
		 System.out.println(a[i]);
