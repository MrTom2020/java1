package baixinchao;

import java.util.Scanner;

public class cau_9 
{
	private double a,b,kq;
	public void nhap()
	{
		System.out.print("\nMoi ban nhap so");
		cau_9 pt2s = new cau_9();
		Scanner A = new Scanner(System.in);
		this.a = Double.parseDouble(A.nextLine());
		this.b = Double.parseDouble(A.nextLine());
		

	}
	public void xuat()
	{
		System.out.print(this.kq);
	}
	public cau_9()
	{
		double a,b,kq;
	}
	public cau_9(double aa,double bb)
	{
		this.a = aa;
		this.b = bb;
	}
	//public void xuat()
	public double tong()
	{
		this.kq = this.a + this.b;
		return this.kq;
	}
	public double nhan()
	{
		this.kq = this.a * this.b;
		return this.kq;
	}
	public double chia()
	{
		this.kq = this.a / this.b;
		return this.kq;
	}
	public double tru()
	{
		this.kq = this.a - this.b;
		return this.kq;
	}
	public double laydu()
	{
		float du = (float)(this.a%this.b);
		this.kq = du;
		return this.kq;
	}
	public double laynguyen()
	{
		int nguyen= (int)(this.a / this.b);
		this.kq = nguyen;
		return this.kq;
	}
	


}
