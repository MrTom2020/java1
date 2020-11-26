package baixinchao;

import java.util.Scanner;

public class sophuc
{
	private
		double A,B;
	public sophuc()
	{
		double A,B;
	}
	public sophuc nhap()
	{
		Scanner ss5 = new Scanner(System.in);
		System.out.print("\nMoi ban nhap  phan thuc");
		double aa2 = Double.parseDouble(ss5.nextLine());
		Scanner ss6 = new Scanner(System.in);
		System.out.print("\nMoi ban nhap  phan ao");
		double aa3 = Double.parseDouble(ss6.nextLine());
		sophuc A = new sophuc(aa2,aa3);
		return A;
		
	}
	public sophuc(double a,double b)
	{
		this.A = a;
		this.B = b;
	}
	public sophuc cong(sophuc a,sophuc b)
	{
		sophuc sp = new sophuc(0,0);
		sp.A = a.A + b.A;
		sp.B = a.B + b.B;
		return sp;
	}
	public  sophuc tru(sophuc a,sophuc b)
	{
		sophuc sp = new sophuc(0,0);
		sp.A = a.A - b.A;
		sp.B = a.B - b.B;
		return sp;
	}
	public  sophuc nhan(sophuc a,sophuc b)
	{
		sophuc sp = new sophuc(0,0);
		sp.A =a.A *b.A - a.B * b.B;
		sp.B = a.A * b.B - a.B *b.A;
		return sp;
	}
    public  void xuat()
    {
    	System.out.print(this.A +"+"+ this.B+"i");
    }
}
