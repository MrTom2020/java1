package baixinchao;

import java.util.Scanner;

public class kiemtrakytu
{
	private char kt;
	void nhap()
	{
		kiemtrakytu kt = new kiemtrakytu();
		boolean b = false;
		do
		{
		System.out.print("\nMoi ban nhap mot ky tu");
		Scanner s = new Scanner(System.in);
		kt.kt = (s.nextLine()).charAt(0);	
		b = true;
		if(xuat(kt.kt) == true)
		{
			System.out.print("\nKy tu ban vua nhap la nguyen am");
		}
		else
		{
			System.out.print("\nKy tu ban vua nhap la phu am");
		}
		
		}while(b == false);
		
	}
	boolean xuat(char chuoi)
	{
		if(chuoi == 'a' || chuoi == 'u' || chuoi == 'o' || chuoi == 'e' ||chuoi == 'i'|| chuoi == 'A' || chuoi == 'U' || chuoi == 'O' || chuoi == 'E' ||chuoi == 'I')
		{
			return true;
			//System.out.print("\nKy tu ban vua nhap la nguyen am");
		}
		else
		{
			return false;
			//System.out.print("\nKy tu ban vua nhap la phu am");
		}
	}

}
