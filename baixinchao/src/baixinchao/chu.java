package baixinchao;
import baixinchao.hinh;
import baixinchao.kiemtratamgiacvuong;
import baixinchao.kiemtratamgiac;
import baixinchao.kiemtraso;
import baixinchao.hinhthang;
import baixinchao.phanso;
import baixinchao.tamgiac;
import baixinchao.cau_9;
import baixinchao.laixuatkep;
import baixinchao.vuong;
import baixinchao.hinhtron;
import baixinchao.timphanduvaphannguyen;
import baixinchao.kiemtrakytu;
import baixinchao.pheptinhhaiso;
import java.io.IOException;
import java.util.Scanner;
import baixinchao.phuongtrinhbachai;
import baixinchao.sophuc;
import baixinchao.kiemtrachuoikytu;
import baixinchao.chuyensothanhchu;
import baixinchao.chunhat;
public class chu
{
	public static void main(String[] args) throws IOException
	{
		chu C = new chu();
		C.menu();
		while(true)
		{
		System.out.print("\nMoi ban chon");
		Scanner n1 = new Scanner(System.in);
		boolean t = true;
		do
		{
			try
			{
				int chon = Integer.parseInt(n1.nextLine());
				switch(chon)
				{
				case 3:
					System.out.print("\nMoi ban nhap chieu dai va rong");
					float r = Float.parseFloat(n1.nextLine());
					float c = Float.parseFloat(n1.nextLine());
				    hinh h = new chunhat(r,c);
				    System.out.print("\nDien tich cua hinh chu nhat la");
				    System.out.print(h.dientich());
				    System.out.print("\nChu vi cua hinh chu nhat la");
				    System.out.print(h.chuvi());
				    break;
				
				case 2:
					System.out.print("\nmoi ban nhap chieu dai");
					float r4 = Float.parseFloat(n1.nextLine());
				    hinh h5 = new vuong(r4,r4);
				    System.out.print("\nDien tich cua hinh vuong la");
				    System.out.print(h5.dientich());
				    System.out.print("\nChu vi cua hinh vuong la");
				    System.out.print(h5.chuvi());
				    break;
				case 1:
					System.out.print("\nmoi ban nhap chieu dai ba canh tam giac");
					float r6 = Float.parseFloat(n1.nextLine());
					float r7 = Float.parseFloat(n1.nextLine());
					float r8 = Float.parseFloat(n1.nextLine());
				    hinh h7 = new tamgiac(r6,r7,r8);
				    System.out.print("\nDien tich cua tam giac la");
				    System.out.print(h7.dientich());
				    break;
				case 4:
					System.out.print("\nmoi ban nhap day lon,day be,do dai, canh benh");
					float r12 = Float.parseFloat(n1.nextLine());
					float r13 = Float.parseFloat(n1.nextLine());
					float r14 = Float.parseFloat(n1.nextLine());
					float r15 = Float.parseFloat(n1.nextLine());
					
				    hinh h9 = new hinhthang(r12,r13,r14,r15);
				    System.out.print("\ndien tich cua hinh thang la");
				    System.out.print(h9.dientich());
				    System.out.print("\nchu vi cua hinh thang la");
				    System.out.print(h9.chuvi());
				    break;
				case 5:
					kiemtraso kt = new kiemtraso();
					kt.nhap();
					break;
				case 6:
					chuyensothanhchu cd = new chuyensothanhchu();
					cd.nhap();
					break;
				case 7:
					kiemtratamgiac KT = new kiemtratamgiac();
					KT.nhap();
					break;
				case 8:
					kiemtratamgiacvuong tgv = new kiemtratamgiacvuong();
					tgv.nhap();
					break;
				case 9:
					kiemtrachuoikytu ktc = new kiemtrachuoikytu();
					ktc.nhap();
					break;
				case 10:
					phuongtrinhbachai pt2 = new phuongtrinhbachai();
					pt2.nhap();	
					break;
				case 11:
					timphanduvaphannguyen dvn = new timphanduvaphannguyen();
					dvn.nhap();
					break;
				case 12:
					System.out.print("\nMoi ban nhap phuong thuc tinh");
					System.out.print("\n1 + ");
					System.out.print("\n2 -");
					System.out.print("\n3 *");
					System.out.print("\n4 /\n");
					int CHON1 = Integer.parseInt(n1.nextLine());
					
					switch(CHON1)
					{
					case 1: 
						pheptinhhaiso pt4s = new pheptinhhaiso();
						pt4s.nhap();
						pt4s.tong();
						pt4s.xuat();
						break;
					case 2: 
						pheptinhhaiso pt5s = new pheptinhhaiso();
						pt5s.nhap();
						pt5s.tru();
						pt5s.xuat();
						break;
					case 3: 
						pheptinhhaiso pt6s = new pheptinhhaiso();
						pt6s.nhap();
						pt6s.nhan();
						pt6s.xuat();
						break;
					case 4: 
						pheptinhhaiso pt7s = new pheptinhhaiso();
						pt7s.nhap();
						pt7s.chia();
						pt7s.xuat();
						break;
					}
					break;
				case 13:
					cau_9 C9 = new cau_9();
					System.out.print("\nMoi ban nhap phuong thuc tinh");
					System.out.print("\n1 + ");
					System.out.print("\n2 -");
					System.out.print("\n3 *");
					System.out.print("\n4 //");
					System.out.print("\n5 lay du");
					System.out.print("\n6 lay nguyen");
					int CHON2 = Integer.parseInt(n1.nextLine());
					
					switch(CHON2)
					{
					case 1: 
						C9.nhap();
						C9.tong();
						C9.xuat();
						break;
					case 2: 
						C9.nhap();
						C9.tru();
						C9.xuat();
						break;
					case 3: 
						C9.nhap();
						C9.nhan();
						C9.xuat();
						break;
					case 4: 
						C9.nhap();
						C9.chia();
						C9.xuat();
						break;
					case 5: 
						C9.nhap();
						C9.laydu();
						C9.xuat();
						break;
					case 6: 
						C9.nhap();
						C9.laynguyen();
						C9.xuat();
						break;
					}
					break;
				case 14:
					System.out.print("\nMoi ban nhap tu so thu 1");
					double pst = Double.parseDouble(n1.nextLine());
					System.out.print("\nMoi ban nhap mau so thu 1 ");
					double psm = Double.parseDouble(n1.nextLine());
					System.out.print("\nMoi ban nhap tu so thu 2 ");
					double pst1 = Double.parseDouble(n1.nextLine());
					System.out.print("\nMoi ban nhap mau so thu 2 ");
					double psm1 = Double.parseDouble(n1.nextLine());
					phanso ps = new phanso(pst,psm);
					phanso pss1 = new phanso(pst1,psm1);
					System.out.print("\nMoi ban chon phuong thuc tinh ");
					System.out.print("\n1 + ");
					System.out.print("\n2 -");
					System.out.print("\n3 *");
					System.out.print("\n4 //");
					int chot = Integer.parseInt(n1.nextLine());
					
					switch(chot)
					{
					case 1:
						System.out.print("\nKet qua phep cong ");
						ps.cong(pss1);
						break;
					case 2:
						System.out.print("\nKet qua phep tru ");
						ps.tru(pss1);
						break;
					case 3:
						System.out.print("\nKet qua phep phan ");
						ps.nhan(pss1);
						break;
					case 4:
						System.out.print("\nKet qua phep chia ");
						ps.chia(pss1);
						break;
					
					}
					
					break;
				case 15:
					kiemtrakytu kytu = new kiemtrakytu();
					kytu.nhap();
					break;
				case 16:
					laixuatkep lxk = new laixuatkep();
					lxk.nhap();
					break;
				case 17:
					System.out.print("\nMoi ban nhap phuong thuc tinh");
					System.out.print("\n1 + ");
					System.out.print("\n2 -");
					System.out.print("\n3 *");
					int CHON = Integer.parseInt(n1.nextLine());
					
					switch(CHON)
					{
					case 1: 
						
						sophuc sp = new sophuc();
						sp = sp.nhap();
						sophuc sp2 = new sophuc();
						sp2 = sp2.nhap();
						sophuc sp3 = new sophuc();
						sp3 = sp3.cong(sp, sp2);
						System.out.print("KET QUA");
						//System.out.print(sp3);
						sp3.xuat();
						break;
					case 2: 
						sophuc sp4 = new sophuc();
						sp4 = sp4.nhap();
						sophuc sp5 = new sophuc();
						sp5 = sp5.nhap();
						sophuc sp6 = new sophuc();
						sp6 = sp6.cong(sp4, sp5);
						System.out.print("KET QUA");
						sp6.xuat();
						break;
					case 3: 
						sophuc sp7 = new sophuc();
						sp7 = sp7.nhap();
						sophuc sp8 = new sophuc();
						sp8 = sp8.nhap();
						sophuc sp9 = new sophuc();
						sp9 = sp9.cong(sp7, sp8);
						System.out.print("KET QUA");
						//System.out.print(sp9);
						sp9.xuat();
							break;
					}
				
				}
			
				t = true;
			}catch(NumberFormatException e)

			{
				t = false;
			}
		}while(t == false);
		}
		
	}
	public void menu()
	{
		System.out.print("\n1 Tinh dien tich hinh tam giac");
		System.out.print("\n2 Tinh dien tich va chu vi hinh vuong");
		System.out.print("\n3 Tinh dien tich va chu vi hinh chu nhat");
		System.out.print("\n4 Tinh dien tich va chu vi hinh thang");
		System.out.print("\n5 bai 1 kiem tra so vua nhap la am hay duong");
		System.out.print("\n6 bai 2 chuyen so vua nhap thanh chu");
		System.out.print("\n7 bai 3 kiem tra ba so thuc vua nhap co phai tam giac khong");
		System.out.print("\n8 bai 4 kiem tra ba so vua nhap co phai tam giac vuong");
		System.out.print("\n9 bai 5 kiem tra dinh dang ky tu nhap vao");
		System.out.print("\n10 bai 6 phuong trinh bac hai");
		System.out.print("\n11 bai 7 tim phan du va phan nguyen");
		System.out.print("\n12 bai 8 nhap hai so va thuc thien cac phep tinh cong, tru, nhan, chia");
		System.out.print("\n13 bai 9 bai mo rong cua bai 8");
		System.out.print("\n14 bai 10 tinh 2 phan so");
		System.out.print("\n15 bai 11 kiem tra ky tu nhap vao la nguyen am hay phu am");
		System.out.print("\n16 bai 12 tinh lai xuat kep");
		System.out.print("\n17 bai 13 Tinh so phuc");
	}

}
