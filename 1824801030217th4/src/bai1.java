import java.util.ArrayList;
import java.util.Scanner;

public class bai1 
{
	private ArrayList<canbo> cb = new ArrayList<canbo>();
	private int bacluong = 0;
	private String hoten = "",diachi = "",congviec = "",nganhdaotao = "";
	private double tuoi = 0;
	private boolean gioitinh = false;
	private int chon1 = 0,soluong = 0;
	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		bai1 b1 = new bai1();
		System.out.println("Moi ban nhap so luong can bo ");
		b1.soluong = Integer.parseInt(b1.sc.nextLine());
		for(int i = 0; i < b1.soluong;++i)
		{
			b1.menu();
			System.out.println("Moi ban chon can bo");
			b1.chon1 = Integer.parseInt(b1.sc.nextLine());
			System.out.println("Moi ban nhap ho ten");
			b1.hoten = b1.sc.nextLine();
			System.out.println("Moi ban nhap tuoi");
			b1.tuoi = Integer.parseInt(b1.sc.nextLine());
			System.out.println("Moi ban nhap gioi tinh");
			b1.gioitinh = Boolean.parseBoolean(b1.sc.nextLine());
			System.out.println("Moi ban nhap dia chi");
			b1.diachi = b1.sc.nextLine();
			switch(b1.chon(b1.chon1))
			{
				case "kysu":
						System.out.println("Moi ban nhap nganh hoc");
						b1.nganhdaotao = b1.sc.nextLine();
						canbo ks = new kysu(b1.hoten,b1.diachi,b1.tuoi,b1.gioitinh,b1.nganhdaotao);
						b1.cb.add(ks);
						break;
				case "nhanvien":
						System.out.println("Moi ban nhap cong viec");
						b1.congviec = b1.sc.nextLine();
						canbo nv = new nhanvien(b1.hoten,b1.diachi,b1.tuoi,b1.gioitinh,b1.congviec);
						b1.cb.add(nv);
						break;
				case "congnhan":
						System.out.println("Moi ban nhap bac luong");
						b1.bacluong =Integer.parseInt(b1.sc.nextLine());
						canbo cn = new congnhan(b1.hoten,b1.diachi,b1.tuoi,b1.gioitinh,b1.bacluong);
						b1.cb.add(cn);
						break;
			}
			
		}
		System.out.println("||  HO TEN 	   ||	  TUOI 	|| 	DIA CHI	  ||  	GIOI TINH	 || ");
		for(int j = 0; j < b1.cb.size();++j)
		{
			System.out.println( "  " + b1.cb.get(j).getHoten() + "\t\t\t" + b1.cb.get(j).gettuoi() +"\t\t" + b1.cb.get(j).getDiachi()  + "\t\t" + b1.gioitinh(b1.cb.get(j).getgioitinh()));
		}
		
	}
	public void menu()
	{
		System.out.println("1 Ky su");
		System.out.println("2 Nhan vien");
		System.out.println("3 Cong nhan");
	}
	public String gioitinh(boolean b)
	{
		return b == true ? "Nam":"Nu";
	}
	public String chon(int n)
	{
		return n == 1 ? "kysu": n == 2 ? "nhanvien":"congnhan";
	}
}
