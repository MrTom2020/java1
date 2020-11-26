package baixinchao;

import java.util.Scanner;

public class kiemtratamgiacvuong
{
	private double a,b,c;
	static  void nhap()
	{
		kiemtratamgiacvuong tg = new kiemtratamgiacvuong();
		boolean b = false;
		do
		{
			try
			{
					System.out.print("nXin moi ban nhap ba canh tam giac");
					Scanner sc = new Scanner(System.in);
					Scanner sc1 = new Scanner(System.in);
					Scanner sc2 = new Scanner(System.in);
					tg.a = Double.parseDouble(sc.nextLine());
					tg.b = Double.parseDouble(sc1.nextLine());
					tg.c = Double.parseDouble(sc2.nextLine());
					b = true;
					tg.xuat(tg.a, tg.b, tg.c);
					
			}catch(NumberFormatException e)	
			{
				b = false;
			}
		}while(b == false);
		
	}
	static void xuat(double A,double B,double C)
	{
		double ca =(double)Math.sqrt(C * C+ B * B);
		double cb =(double)Math.sqrt(C * C+ A * A);
		double cc =(double)Math.sqrt(A * A+ B * B);
		if(ca  == A || cb == B || cc == C)
		{
			System.out.print("nDAY LA MOT TAM GIAC VUONG");
		}
		else
		{
			System.out.print("nDAY KHONG PHAI LA MOT TAM GIAC VUONG");
		}
}
}
