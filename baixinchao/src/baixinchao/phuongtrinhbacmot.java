package baixinchao;

import java.awt.Menu;
import java.util.Scanner;

public class phuongtrinhbacmot 
{
	 public  float n,m;
	public float pt1(float a,float b)
	{
		return (float)-b/a;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nMoi ban nhap a va b");
		Scanner s2 = new Scanner(System.in);
		phuongtrinhbacmot b = new phuongtrinhbacmot();
		try
		{
			
		b.n = Float.parseFloat(s.nextLine());
		b.m = Float.parseFloat(s2.nextLine());
		}
		catch(NumberFormatException e)
		{
			System.out.print("Khong phai la so");
		}
		System.out.print("\nKET QUA");
		System.out.print(b.pt1(b.n, b.m));
		
	}
	
	
}
