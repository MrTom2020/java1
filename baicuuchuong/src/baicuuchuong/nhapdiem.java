package baicuuchuong;

import java.util.Scanner;

public class nhapdiem 
{
	double di;
	public static void main(String[] args) {
		boolean b = false;
		Scanner sn = new Scanner(System.in);
		nhapdiem nd = new nhapdiem();
		while(b == false)
		{
			System.out.println("\nMoi ban nhap");
			try
			{
				nd.di = Double.parseDouble(sn.nextLine());
				b = true;
				if(nd.di <0 || nd.di > 10)
				{
					System.out.println("\nMoi ban nhap lai");
					b = false;
				}
			}catch(NumberFormatException ex)
			{	
				System.out.println("\nXIN HAY NHAP LAI");
				b = false;
			}
		}
		System.out.println(nd.di);
	}
}
