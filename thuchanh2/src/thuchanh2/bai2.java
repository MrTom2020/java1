package thuchanh2;

import java.util.Scanner;

public class bai2
{
	int n,S = 0;
	Scanner sn = new Scanner(System.in);
	public static void main(String[] args)
	{	
		boolean bb = false;
		bai2 b2 = new bai2();
		do
		{
		try
		{
			System.out.print("Moi ban nhap so n ");
			b2.n = Integer.parseInt(b2.sn.nextLine());
			for(int k = 1;k <= b2.n;++k)
			{
				b2.S +=k;
			}
			bb = true;
			
		}
		catch(NumberFormatException ex)
		{
			bb = false;
			System.out.println("Xin moi ban nhap lai");
			b2.S = 0;
		}
		}while(bb == false);
		if(bb == true)
		{
			System.out.println(b2.S);
		}
	}
}
