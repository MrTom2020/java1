package lethanhhiep_1824801030217;

import java.util.Scanner;


public class baisohai 
{
	public float A,B,C;
	public static void main(String[] args) 
	{
		System.out.print("Moi ban nhap ba tham so");
		baisohai ptb2 = new baisohai();
		Boolean b = true;
		do
		{
			try
			{
				Scanner ss = new Scanner(System.in);
				Scanner ss1 = new Scanner(System.in);
				Scanner ss2 = new Scanner(System.in);
				ptb2.A = Float.parseFloat(ss.nextLine());
				ptb2.B = Float.parseFloat(ss1.nextLine());
				ptb2.C = Float.parseFloat(ss2.nextLine());
				b = true;
			}
			catch(NumberFormatException e)
			{
				b = false;
			}
			ptb2.bachai(ptb2.A, ptb2.B, ptb2.C);
		}while(b == false);
		
		
	}
	public static void bachai(float a,float b,float c)
	{
		float d = b * b - 4 * a * c;
		final double x1,x2;
		if(d < 0)
		{
			System.out.print("Phuong trinh vo nghiem");
		}
		if(d > 0)
		{
			
	    	if(d == 0)
	    	{
	    		x1 = (float)-b/2/a;
	    		System.out.print(x1);
	    	}
	    	else
	    	{
	    		x1 = (float)(-b + Math.sqrt(d))/2/a;
	    		x2 = (float)(-b -Math.sqrt(d))/2/a;
	    		
	    		System.out.print("Nghiem thu nhat :");
	    		System.out.print(x1);
	    		System.out.print("\nNghiem thu hai : ");
	    		System.out.print(x2);
	    	}
		}
	}
}
