package thuchanh2;

import java.util.Scanner;

public class bai13 
{
	String c;
	String test = "";
	int d =0;
	public static void main(String[] args) 
	{
		bai13 b13 = new bai13();
		Scanner sn = new Scanner(System.in);
		boolean bb = false;
		
			System.out.print("Moi ban nhap chuoi n ");
			b13.c= (sn.nextLine());
			for(int k = 0; k < b13.c.length();++k)
			{
				if(b13.c.charAt(k)== ' ')
				{
					b13.c.trim();
				}
				else
				{
					b13.test += String.valueOf(b13.c.charAt(k));
				}
			}
			for(int j = 0; j < b13.test.length();++j)
			{
				if(b13.c.charAt(j) == 'c' && b13.c.charAt(j + 1) == 'h')
				{
					b13.d+=1;
				}
			}
			System.out.println("SO LAN XUAT HIEN CH LA " +b13.d);
		}
		
}


