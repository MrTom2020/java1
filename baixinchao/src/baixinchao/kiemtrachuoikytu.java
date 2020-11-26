package baixinchao;

import java.util.Scanner;

public class kiemtrachuoikytu
{
	private String chuoinhap;
	Scanner sn = new Scanner(System.in);
	boolean b = false;
	public void nhap()
	{
		do
		{
		kiemtrachuoikytu kt = new kiemtrachuoikytu();
		System.out.print("\nMoi ban nhap chuoi");
		kt.chuoinhap = sn.nextLine();
		b = kiemtra(kt.chuoinhap);
		if(b == false)
		{
			System.out.print("\nXin vui long nhap lai dung dinh dang\n");
		}
		if(b == true)
		{
			System.out.print("\ndung dinh dang");
		}
		}
		while(b == false);
		
	}
	public boolean kiemtra(String s)
	{
		String kk = "TDM";
		boolean c = s.startsWith(kk);
		for(int i = 3; i < s.length();i++)
		{
			if(s.charAt(i) < '0' || s.charAt(i) > '9' || s.length() > 10)
			{
				return false;
			}
		}
		return c;
	}

}
