package baixinchao;

import java.util.Scanner;

public class chuyensothanhchu 
{
	private int so;
	static void nhap()
	{
		chuyensothanhchu kt = new chuyensothanhchu();
		boolean b = false;
		do
		{
		try
		{
		System.out.print("\nXin hay nhap so kiem tra ");
		Scanner sc = new Scanner(System.in);
		kt.so = Integer.parseInt(sc.nextLine());
		b = true;
		kt.xuat(kt.so);
		}catch(NumberFormatException e)
		{
			b = false;
		}
		}while(b == false);
	}
	static void xuat(int s)
	{
		String kk = s < 0 ? "AM":" ";
		if(s < 0)
		{
			s = s * -1;
		}
		String k = "\nSO";
		String kq =s == 9 ? "CHIN":s== 8 ?"TAM":s == 7 ? "BAY":s== 6 ?"SAU":s == 5 ? "NAM":s== 4 ?"BON":s == 3 ? "BA":s== 2 ?"HAI":s == 1 ? "MOT":"KHONG";
		System.out.print(k + " "+ kk + " " + kq);
	}
}
