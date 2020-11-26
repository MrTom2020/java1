package lethanhhiep_1824801030217;

import java.util.Scanner;

public class baisomot
{
	static int a[][],nn,mm;
	public static void main(String[] args)
	{
		baisomot b1 = new baisomot();

		System.out.print("Moi ban nhap dong va cot\n");
		Scanner n = new Scanner(System.in);
		Scanner m = new Scanner(System.in);
		b1.nn = n.nextInt();
		b1.mm = m.nextInt();
		a = new int[b1.nn][b1.mm];
		b1.nhap(b1.a, b1.nn, b1.mm);
		b1.xuat(b1.a, b1.nn, b1.mm);
		b1.max(b1.a, b1.nn, b1.mm);
		b1.nguyento(b1.a, b1.nn, b1.mm);
		b1.cotnhieunguyento(b1.a, b1.nn, b1.mm);
		b1.xuat1(b1.a, b1.nn, b1.mm);
		//b1.xuat(b1.a, b1.nn, b1.mm);
	}
	static void nhap(int A[][],int n,int m)
	{
		
		for(int i =0; i < n;++i)
		{
			for(int j =0;j < m;++j)
			{
				int vt = m * (i - 1 + 1) + j - 1 + 1 + 1;
				System.out.print("Nhap phan tu thu : " + vt + " : ");
				Scanner s = new Scanner(System.in); 
				A[i][j] = s.nextInt();
			}
		}
	}
	static boolean ch(int x)
	{
		if(x<2)
			return false;
		for(int i=2; i<=x/2; i++)
			if(x%i==0)
				return false;
		return true;
	}
	static void nguyento(int A[][],int n,int m)
	{
		System.out.print("\nCac so nguyen to trong ma tran ");
		for(int i =0; i < n;++i)
		{
			for(int j =0;j < m;++j)
			{
				if(ch(A[i][j]) == true)
				{
					System.out.print(A[i][j] + " ");
				}
			
			}
		}
	}
	static int dem(int A[][], int i ,int k)
	{
		int d = 0;
		for(int j = 1;j < k;++j)
		{
			if(ch(A[j][i]) == true)
			{
				d++;
			}
		}
		return d;
	}
	static void cotnhieunguyento(int A[][],int n,int m)
	{
		int mm = -9999;
		int h = 1;
		System.out.print("\nCot co so nguyen to nhieu nhat trong ma tran ");
		for(int i =0;i < m;i++)
		{
			if(dem(A,i,m) > mm)
			{
				mm = dem(A,i,m);
				h = i;
			}
		}
		int nnn = mm +1;
		System.out.print(nnn);
	}
	static void max(int A[][],int n,int m)
	{
		int MAX = -9999;
		for(int i =0; i < n;++i)
		{
			for(int j =0;j < m;++j)
			{
				if(A[i][j] > MAX)
				{
					MAX = A[i][j];
				}
			}
		}
		System.out.print("\nSo lon nhat trong mang la " + MAX);
	}
	static void xuat(int A[][],int n,int m)
	{
		for(int i =0; i < n;++i)
		{
			for(int j =0;j < m;++j)
			{
				System.out.print(A[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	static void xuat1(int A[][],int n,int m)
	{
		System.out.print("\n");
		int k[] = new int[100];
		int mmm = -9999;
		int t,h=0;
		for(int i =0;i < n;i++)
		{
			for(int j = 0;j < m;++j)
			{
				//if()
			}
		}
       
	}
	static void hv(int a,int b)
	{
		int c = a;
		a = b;
		b = c;
	}

}
