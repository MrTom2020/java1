package baixinchao;

import java.util.Scanner;

public class timphanduvaphannguyen
{
	private double a,b;
	void nhap()
	{
	timphanduvaphannguyen tg = new timphanduvaphannguyen();
	boolean B = false;
	do
	{
		try
		{
				System.out.print("nXin moi ban nhap hai so");
				Scanner sc = new Scanner(System.in);
				tg.a = Double.parseDouble(sc.nextLine());
				tg.b = Double.parseDouble(sc.nextLine());
				B = true;
				tg.xuat(tg.a, tg.b);
				
		}catch(NumberFormatException e)	
		{
			B = false;
		}
	}while(B == false);

}
	void xuat(double A,double B)
	{
		double nguyen,du;
		int ng = (int)(A/B);
		float du1 = (float)(A%B);
		nguyen = ng;
		du = du1;
		System.out.print("\nSo nguyen cua phep chia 2 so tren la" + nguyen);
		System.out.print("\nSo du cua phep chia 2 so tren la" + du);
	}
	}

