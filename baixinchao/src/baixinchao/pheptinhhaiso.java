package baixinchao;

import java.util.Scanner;

public class pheptinhhaiso 
{
	private double a,b,kq;
	public void nhap()
	{
		System.out.print("\nMoi ban nhap so");
		pheptinhhaiso pt2s = new pheptinhhaiso();
		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		this.a = Double.parseDouble(A.nextLine());
		this.b = Double.parseDouble(B.nextLine());
		

	}
	public void xuat()
	{
		System.out.print(this.kq);
	}
	public pheptinhhaiso()
	{
		double a,b,kq;
	}
	public pheptinhhaiso(double aa,double bb)
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
	
}
