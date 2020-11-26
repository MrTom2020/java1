import java.util.ArrayList;
import java.util.Scanner;

public class bai3
{
	private String Hoten = "",diachi = "",trinhdo = "",namsinh ="",loai = "";
	private Scanner sc = new Scanner(System.in);
	private int chon = 0,soluong = 0;
	private ArrayList<vienchuc> listvc = new ArrayList<vienchuc>();	
	
	public static void main(String[] args)
	{
		bai3 b3 = new bai3();
		System.out.println("Moi ban nhap so luong vien chuc ");
		b3.soluong = Integer.parseInt(b3.sc.nextLine());
		b3.nhap();
		b3.xuat();
		
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Moi ban nhap ho ten ");
			this.Hoten = this.sc.nextLine();
			System.out.println("Moi ban nhap dia chi ");
			this.diachi = this.sc.nextLine();
			System.out.println("Moi ban nhap trinh do ");
			this.trinhdo = this.sc.nextLine();
			System.out.println("Moi ban nhap nam sinh ");
			this.namsinh = this.sc.nextLine();
			
			this.menu();
			this.chon = Integer.parseInt(this.sc.nextLine());
			switch (this.chon) {
			case 0:
				return;
			case 1:
				this.loai = "Nhan vien";
				float diemthi = 0;
				System.out.println("Moi ban nhap diem tin hoc ");
				diemthi = Integer.parseInt(this.sc.nextLine());
				vienchuc nvhd = new nhanvienhopdong(this.Hoten,this.diachi,this.trinhdo,this.namsinh,diemthi,"");
				nvhd.setloai(this.loai);
				this.listvc.add(nvhd);
				break;
			case 2:
				this.loai = "Vien chuc";
				float diemthingoaing= 0,diemthiql = 0;
				System.out.println("Moi ban nhap diem tieng anh ");
				diemthingoaing = Integer.parseInt(this.sc.nextLine());
				System.out.println("Moi ban nhap diem quan ly nha nuoc ");
				diemthiql = Integer.parseInt(this.sc.nextLine());
				vienchuc vc = new dtvienchuc(this.Hoten,this.diachi,this.trinhdo,this.namsinh,diemthingoaing,diemthiql,"");
				vc.setloai(this.loai);
				this.listvc.add(vc);
				break;
			case 3:
				this.loai = "Vien chuc";
				float diemtutuong= 0,diemlyluan = 0;
				System.out.println("Moi ban nhap diem tu tuong  ");
				diemtutuong = Integer.parseInt(this.sc.nextLine());
				System.out.println("Moi ban nhap diem ly luan ");
				diemthiql = Integer.parseInt(this.sc.nextLine());
				vienchuc ld = new lanhdao(this.Hoten,this.diachi,this.trinhdo,this.namsinh,diemtutuong,diemthiql,"");
				ld.setloai(this.loai);
				this.listvc.add(ld);
				break;
			}
		}
	}
	public void xuat()
	{
		System.out.println("||  Ho ten     || dia chi    ||  trinh do   || nam sinh    || vi tri" );
		for(int i = 0;i < this.listvc.size();++i)
		{
			System.out.println("    " + this.listvc.get(i).getHoten() + "\t  " + this.listvc.get(i).getdiachi() +"\t\t"+ this.listvc.get(i).gettrinhdo() + "\t\t" + this.listvc.get(i).getnamsinh() + "\t\t" + this.listvc.get(i).getloai());
		}
	}
	public void menu()
	{
		System.out.println("Moi ban chon");
		System.out.println("1 Nhan vien theo hop dong");
		System.out.println("2 Vien chuc");
		System.out.println("3 Lanh dao");
		System.out.println("0 thoat");
	}
}
