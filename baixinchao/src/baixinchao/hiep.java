package baixinchao;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class hiep 
{
	public static void main(String[] args) {

		System.out.print("nhap n");
		try
		{
		Scanner sv= new Scanner(System.in);
		int n = Integer.parseInt(sv.nextLine());
		String hoten[] = new String[n];
		for(int i = 0;i < n;++i)
		{
			System.out.print("ten thu" + (i+1) +" : ");
			hoten[i] = sv.nextLine();
		}
		System.out.print("ten muon tim");
		boolean c = false;
		String tk = sv.nextLine();
		for(int j = 0; j < hoten.length;++j)
		{
			c = tk.equals(hoten[j]);
			if(c == true)
			{
				System.out.print("Sinh vien" + (j +1) + " : ");
				break;
			}
			
		}
		if(c !=true)
		{
			System.out.print("hihih");
		}
		}catch(NumberFormatException e)
		{
			System.out.print("Loi");
		}
		
	}
}
