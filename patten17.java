class patten17
{
	public static void main(String[] args) 
	{
		char x='A';
		int y=10;
		for (int i=1;i<=5 ;i++)
		{
			for (int j=1;j<=5 ;j++ )                 
			{
				if (i%2==0)
				{
					System.out.print(" "+x+"  ");
					x++;
				}
				else 
				{
					System.out.print(" "+y+" ");
					y++;
				}
			}
				
				
			System.out.println();
			
		}
	}
}