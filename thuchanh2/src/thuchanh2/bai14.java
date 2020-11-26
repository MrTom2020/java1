package thuchanh2;

import java.util.Scanner;

public class bai14
{
	String hovaten;
	boolean b = false;
	public static void main(String[] args)
	{
		bai14 b14 = new bai14();
		Scanner sc = new Scanner(System.in);
		System.out.println("XIN MOI BAN NHAP HO TEN");
		b14.hovaten = sc.nextLine();
		b14.b = kiemtra(b14.hovaten);
		if(b14.b == true)
		{
			System.out.println("Nguoi do ho tran");
		}
		else
		{
			System.out.println("Nguoi do khong phai ho tran");
		}
		
	}
	public static boolean kiemtra(String s)
	{
		int dem = 0;
		String ss ="";
		for(int k =0 ; k < s.length();++k)
		{
			if(s.charAt(k) != ' ')
			{
				ss += String.valueOf(s.charAt(k));
			}
			if(s.charAt(k) == ' ')
			{
				
				dem++;
				if(dem != 1)
				{
					return false;
				}
				if(ss.equals("tran") || ss.equals("Tran") || ss.equals("TRAN"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
	}

}
