package thuchanh2;

import java.util.Scanner;

public class bai3 
{
	boolean bb = false;
	int n;
	double S=0;
	public static void main(String[] args)
	{
		bai3 b3 = new bai3();
		Scanner sn = new Scanner(System.in);
		do
		{
			try
			{
				System.out.print("Moi ban nhap so n ");
				b3.n = Integer.parseInt(sn.nextLine());
				for(int k = 1;k <= b3.n;++k)
				{
				//	System.out.println(k);
					float kk = (float)(1.0/k);
					b3.S = b3.S + kk;
				}
				b3.bb = true;
		
			}
			catch(NumberFormatException ex)
			{
				b3.bb = false;
				System.out.println("Xin moi ban nhap lai");
				b3.S = 0;
			}
			}while(b3.bb == false);
			if(b3.bb == true)
			{
				System.out.println(b3.S);
			}

		}
	}


