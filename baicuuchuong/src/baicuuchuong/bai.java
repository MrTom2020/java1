package baicuuchuong;

public class bai 
{
	static int min = 27,max = 250;
	static	int d;
	static int c;
	public static void main(String[] args) 
	{
		int i = min,j = max;
		while(i <= max)
		{
			System.out.println(i);
			if(i%3 == 0)
			{
				d=i;
				while(j >= min)
				{
					if(j%3 == 0)
					{
						System.out.println(j);
						c=j;
						break;
					}
					j--;
				} 
				break;
			}
			i++;
		}
		int sl = ((c - d)/(3) + 1);
		int tong = (d + c)* sl / 2;
		double trungbinhcong = (double)(tong/sl);
		System.out.println("Cac so chia het cho ba la");
		System.out.println(sl);
		System.out.println("Tong cac so chia het cho ba la");
		System.out.println(tong);
		System.out.println("Trung binh tong cac so chia het cho ba la");
		System.out.println(trungbinhcong);
	}
	

}
