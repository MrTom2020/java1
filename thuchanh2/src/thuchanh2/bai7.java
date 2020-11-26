package thuchanh2;

import java.util.Scanner;

public class bai7
{
	String so,du ="";
	 int s = 0;
	public static void main(String[] args) 
	{
		bai7 b7 = new bai7();
		Scanner sn = new Scanner(System.in);
		System.out.println("Xin moi ban nhap chuoi so : ");
		b7.so = sn.nextLine();

		for(int j = 0; j < b7.so.length();j++)
		{
			if(b7.so.charAt(j) < '0' || b7.so.charAt(j) > '9')
			{
				b7.du+= String.valueOf(b7.so.charAt(j)) + " ";
				b7.so.replace(b7.so.charAt(j), ' ');
				b7.so.trim();
			}
			else if(b7.so.charAt(j) >= '0' || b7.so.charAt(j) <= '9')
			{
				b7.s += Integer.parseInt(String.valueOf(b7.so.charAt(j)));
			}
		}
		System.out.println("Cac ky tu ban da nhap du la " + b7.du);
		System.out.println("Tong cac so trong chuoi la" +b7.s);
	}
}
