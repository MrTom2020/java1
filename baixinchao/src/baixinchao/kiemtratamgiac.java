package baixinchao;

import java.util.Scanner;

public class kiemtratamgiac
{
	private double a,b,c;
	static  void nhap()
	{
		kiemtratamgiac tg = new kiemtratamgiac();
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
		if(A + B > C && A + C > B && C + B > A)
		{
			System.out.print("nDAY LA MOT TAM GIAC");
		}
		else
		{
			System.out.print("nDAY KHONG PHAI LA MOT TAM GIAC");
		}
	}
	
	
}
