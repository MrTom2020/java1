package thuchanh2;

import java.util.Scanner;

public class bai9 
{
	int so,dem = 0;
	public static void main(String[] args)
	{
		bai9 b9 = new bai9();
		
				for(int i = 2;i < 100;++i)
				{
					if(bai9.xuly(i) == 1)
					{
						System.out.println(i);
						b9.dem++;
					}
				}
				System.out.println("Co tong co la " + b9.dem + " so nguyen to");
	}
	public static int xuly(int a)
	{
		for(int i = 2;i <= Math.sqrt(a);i++)
		{
			if(a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

}
