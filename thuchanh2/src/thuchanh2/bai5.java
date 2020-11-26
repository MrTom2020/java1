package thuchanh2;

import java.util.Scanner;

public class bai5 
{
	int so;
	Double tong = 0.0;
	boolean b = false;
	public static void main(String[] args) 
	{
		bai5 b5 = new bai5();
		Scanner sc = new Scanner(System.in);
		while(b5.b == false)
		{
			try
			{
				System.out.println("Moi ban nhap so : ");
				b5.so = Integer.parseInt(sc.nextLine());
				b5.tong = tinhtong(b5.so);
				System.out.println(b5.tong);
				
			}catch(NumberFormatException ex)
			{
				System.out.println("Xin moi ban nhap lai ");
				b5.b = false;
			}
		}
		
	}
	public static double tinhtong(int a)
	{
		if(a == 1)
		{
			return 1.0;
		}
		return (double)a/giaithua(a) + tinhtong(a - 1);
	}
	public static double giaithua(int a)
	{
		if(a == 1)
		{
			return 1.0;
		}
		return (double)(a * giaithua(a - 1));	
	}
}
