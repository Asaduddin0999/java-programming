//49- WAP TO ARMStrong num 1 to 10000 ?-1 OK

class  ARMstrong_Num_1to10000
{
	public static void main(String[] args) 
	{
		int sln=1;
		for (int num=1;num<=10000 ;num++ )
		{
			int count =0;
			int copy=num;
			while (copy!=0)
			{
				count++;
				copy=copy/10;
			}
			copy=num;
			int sum=0;
			while (copy!=0)
			{
				int ld = copy%10;
				int exp=1;
				for (int i=1;i<=count ;i++ )
				{
					exp=exp*ld;
				}
					sum=sum+exp;
					copy=copy/10;
			}
					if (sum==num)
					{
					System.out.println(sln+")"+sum);
					sln++;
					}

		}
		 
	}
}
