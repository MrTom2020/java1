package baixinchao;

import java.util.Scanner;

public class phanso 
{
	private
	double A,B;

public phanso(double a,double b)
{
	super();
	this.A = a;
	this.B = b;
}
public void settu(double tu)
{
	this.A = tu;
}
public void setmau(double mau)
{
	this.B = mau;
}
public double gettu()
{
	return this.A;
}
public double getmau()
{
	return this.B;
}
public double ucnn(double A,double B)
{
	while(A != B)
	{
		if(A > B)
		{
			A -=B;
		}
		else
		{
			B-=A;
		}
	}
	return A;
}
public void toigian()
{
	double d = ucnn(this.gettu(),this.getmau());
	this.settu(this.gettu()/d);
	this.setmau(this.getmau()/d);
}
public void getmau(double mau)
{
	this.B = mau;
}
public void cong(phanso a)
{
	double AA,BB;
	AA = ((this.gettu() * a.getmau()) + (a.gettu() * this.getmau()));
	BB = this.getmau() * a.getmau();
	phanso phansot = new phanso(AA,BB);
	phansot.toigian();
	System.out.print(phansot.A + "// " + phansot.B);
}
public void nhan(phanso a)
{
	double AA,BB;
	AA = (this.gettu() * a.gettu());
	BB = this.getmau() * a.getmau();
	phanso phansot = new phanso(AA,BB);
	phansot.toigian();
	System.out.print(phansot.A + "/" + phansot.B);
}
public void tru(phanso a)
{
	double AA,BB;
	AA = ((this.gettu() * a.getmau()) - (a.gettu() * this.getmau()));
	BB = this.getmau() * a.getmau();
	phanso phansot = new phanso(AA,BB);
	phansot.toigian();
	System.out.print(phansot.A + "/" + phansot.B);
}
public void chia(phanso a)
{
	double AA,BB;
	AA = (this.gettu() * a.getmau());
	BB = this.getmau() * a.gettu();
	phanso phansot = new phanso(AA,BB);
	phansot.toigian();
	System.out.print(phansot.A + "/" + phansot.B);
}

public  void xuat()
{
	System.out.print(this.A +"/"+ this.B+"");
}
}
