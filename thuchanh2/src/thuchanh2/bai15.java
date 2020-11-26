package thuchanh2;

import java.util.Scanner;
import java.io.File;
public class bai15 
{
	String hovaten,duyet = "";;
	public static void main(String[] args) 
	{
		bai15 b15 = new bai15();
		Scanner sc = new Scanner(System.in);
		System.out.println("XIN MOI BAN NHAP KY TU");
		b15.hovaten = sc.nextLine();
		String ss = "";
		for(int j = 0; j < b15.hovaten.length();++j)
		{
			if(b15.hovaten.charAt(j) == ' ')
			{
				b15.hovaten.trim();	
			}
			if(b15.hovaten.charAt(j) != ' ')
			{
				b15.duyet += b15.hovaten.charAt(j);
			}
		}
		System.out.println(b15.duyet);
		for(int i = b15.duyet.length() - 1; i > 0;i--)
		{
			System.out.print(b15.duyet.charAt(i));
		}
	}
}
