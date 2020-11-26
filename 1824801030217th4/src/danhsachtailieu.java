import java.util.ArrayList;
import java.util.Scanner;

public class danhsachtailieu
{
	private int chon = 0,soluong = 0;
	private String MTL ="",TNXB = "",Soph = "";
	private Scanner sc = new Scanner(System.in);
	private ArrayList<tailieu> listtl = new ArrayList<tailieu>();
	public static void main(String[] args)
	{
		danhsachtailieu b2 = new danhsachtailieu();
		System.out.print("Moi ban nhap so luong " );
		b2.soluong = Integer.parseInt(b2.sc.nextLine());
		b2.nhap();
		b2.xuat();
		
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong; ++i)
		{
			System.out.println("Moi ban nhap Ma tai lieu ");
			this.MTL = this.sc.nextLine();
			System.out.println("Moi ban nhap ten nha xuat ban ");
			this.TNXB = this.sc.nextLine();
			System.out.println("Moi ban nhap so ban phat hanh  ");
			this.Soph = this.sc.nextLine();
			
			this.menu();
			this.chon = Integer.parseInt(this.sc.nextLine());
			switch (this.chon) 
			{
			case 1:
				String tentacgia ="";
				int sotrang = 0;
				System.out.println("Moi ban nhap ten gia ");
				tentacgia = this.sc.nextLine();
				System.out.println("Moi ban nhap so trang ");
				sotrang = Integer.parseInt(this.sc.nextLine());
				tailieu tl = new sach(this.MTL,this.TNXB,this.Soph,"SACH",tentacgia,sotrang);
				this.listtl.add(tl);
				break;
			case 2:
				int thangph = 0,soph = 0;
				
				System.out.println("Moi ban nhap thang phat hanh ");
				thangph = Integer.parseInt(this.sc.nextLine());
				System.out.println("Moi ban nhap so phat hanh ");
				soph = Integer.parseInt(this.sc.nextLine());
				tailieu tl1 = new tapchi(this.MTL,this.TNXB,this.Soph,"TAP CHI",soph,thangph);
				this.listtl.add(tl1);
				break;
			case 3:
				String ngayph = "";
				
				System.out.println("Moi ban ngay phat hanh ");
				ngayph = (this.sc.nextLine());

				tailieu tl2 = new bao(this.MTL,this.TNXB,this.Soph,"BAO",ngayph);
				this.listtl.add(tl2);
				break;
			}
		}
	}
	public void menu()
	{
		System.out.println("Moi ban chon");
		System.out.println("1 Sach");
		System.out.println("2 Tap chi");
		System.out.println("3 Bao");
	}
	public void xuat()
	{
		System.out.println("Ma TL || Ten nhan xuat ban || So ban phat hanh || loai tai lieu ");
		for(int i = 0; i < this.listtl.size();++i)
		{
			this.listtl.get(i).xuat();
		}
	}
	
}
