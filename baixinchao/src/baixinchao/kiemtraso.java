package baixinchao;

import java.util.Scanner;

public class kiemtraso
{
	private int so;
	static void nhap()
	{
		kiemtraso kt = new kiemtraso();
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
		String kq =s > 0 ? "\nDAY LA SO DUONG":s < 0 ?"\nDAY LA SO AM":"\nDAY LA SO KHONG DUONG VA KHONG AM";
		System.out.print(kq);
	}
}
