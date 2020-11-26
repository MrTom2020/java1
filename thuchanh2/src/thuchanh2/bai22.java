package thuchanh2;

import java.util.Scanner;

public class bai22 
{
	String nhap;
	String k = "";
	public static void main(String[] args) 
	{
		bai22 b22 = new bai22();
		Scanner sc = new Scanner(System.in);
		System.out.print("Xin nhap chuoi can doi nguoc ");
		b22.nhap = " " + sc.nextLine();
		for(int i = b22.nhap.length() - 1; i>= 0;i--)
		{
			if(b22.nhap.charAt(i) != ' ' || i == b22.nhap.length())
			{
				b22.k += String.valueOf(b22.nhap.charAt(i));
			}
			else if(b22.nhap.charAt(i) == ' ')
			{
				b22.k += " ";
				for(int j = b22.k.length()- 1;j >= 0;j--)
				{
					System.out.print(b22.k.charAt(j));
				}
				b22.k = "";
			}
		}
	}
}
