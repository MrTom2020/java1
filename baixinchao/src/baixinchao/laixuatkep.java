package baixinchao;

import java.util.Scanner;

public class laixuatkep
{
	private double P,R,t,n,kq;
	public void nhap()
	{
		laixuatkep tg = new laixuatkep();
		boolean B = false;
		do
		{
			try
			{
					System.out.print("\nXin moi ban nhap tien goc");
					Scanner sc = new Scanner(System.in);
					tg.P = Double.parseDouble(sc.nextLine());
					System.out.print("\nXin moi ban nhap lai xuat hang nam");
					Scanner sc1 = new Scanner(System.in);
					tg.R = Double.parseDouble(sc.nextLine());
					System.out.print("\nXin moi ban nhap tien tien duoc dau tu hay cho vay");
					Scanner sc2 = new Scanner(System.in);
					tg.t = Double.parseDouble(sc.nextLine());
					System.out.print("\nXin moi ban nhap so lan lai");
					Scanner sc3 = new Scanner(System.in);
					tg.n = Double.parseDouble(sc.nextLine());
					B = true;
					if(tg.P <= 0|| tg.R< 0 || tg.t< 0 || tg.n <=0)
					{
						B = false;
					}
					else
					{
						tg.ketqua();
						tg.xuat();
					}
					//tg.xuat(tg.a, tg.b);
					
			}catch(NumberFormatException e)	
			{
				B = false;
			}
		}while(B == false);
	}
	void xuat()
	{
		System.out.print(this.kq);
	}
	double ketqua()
	{
		this.kq =(double)(this.P*(1+this.R/this.n) *(this.n * this.t) - this.P);
		return this.kq;
	}
}
