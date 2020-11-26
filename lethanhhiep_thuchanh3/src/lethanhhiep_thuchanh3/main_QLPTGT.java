package lethanhhiep_thuchanh3;

import java.util.ArrayList;
import java.util.Scanner;

public class main_QLPTGT {
	static Scanner Inln=new Scanner(System.in);
	static Scanner Inf=new Scanner(System.in);
	static ArrayList <Oto> listoto=new ArrayList<Oto>();
	static ArrayList <XeMay> listxm=new ArrayList<XeMay>();
	static ArrayList <XeTai> listxt=new ArrayList<XeTai>();
	static Oto O;
	static XeMay xm;
	static XeTai xt;
	static String hsx, mau, kdc;
	static int namsx, scn;
	static float khac, giaban;
	
	static void nhap() {
		System.out.print("NHAP HANG SAN XUAT: "); hsx=Inln.nextLine();
		System.out.print("NHAP MAU: "); mau=Inln.nextLine();
		System.out.print("NHAP NAM SAN XUAT: "); namsx=Inf.nextInt();
		System.out.print("NHAP GIA BAN: "); giaban=Inf.nextFloat();
	}
	
	static void nhapO(String str1, String str2) {
		nhap();
		System.out.print("NHAP "+str1+": "); scn=Inf.nextInt();
		System.out.print("NHAP "+str2+": "); kdc=Inln.nextLine();
	}
	
	static void nhapx(String str) {
		nhap();
		System.out.print("NHAP "+str+": "); khac=Inf.nextFloat();
	}
	
	static void nhapds() {
		int n;
		System.out.print("NHAP SO LUONG PHUONG TIEN : ");  n=Inf.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("(1:O To - 2: Xe May - 3: Xe Tai)");
			int lc=Inf.nextInt();
			switch(lc) {
			case 1:
				nhapO("SO CHO NGOI", "KIEU DONG CO ");
				O = new Oto(hsx, mau, namsx, giaban, scn, kdc);
				listoto.add(O);
				break;
			case 2:
				nhapx("Cong suat");
				xm = new XeMay(hsx, mau, namsx, giaban, khac);
				listxm.add(xm);
				break;
			case 3:
				nhapx("Trong tai");
				xt = new XeTai(hsx, mau, namsx, giaban, khac);
				listxt.add(xt);
				break;
			}
		}
	}
	static void xuatds() {
		System.out.println("Danh sach phuong tien giao thong: ");
		if(listoto.size()>0) {
			System.out.println("-----Danh sach phuong tien o to´-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		SO CHO NGOI	 KIEU DONG CO");
			for(int i=0;i<listoto.size();i++) {
				O = listoto.get(i);
				System.out.println((i+1)+"\t\t"+O.HSX+"\t\t"+O.Mau+"\t\t"+O.namXS+"\t\t"+O.Giaban+"\t\t"+O.scn+"\t\t"+O.KieuDC);
			}
		}
		if(listxm.size()>0) {
			System.out.println("-----Danh sach phuong ttien xe may-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		CONG SUAT");
			for(int i=0;i<listoto.size();i++) {
				xm = listxm.get(i);
				System.out.println((i+1)+"\t\t"+xm.HSX+"\t\t"+xm.Mau+"\t\t"+xm.namXS+"\t\t"+xm.Giaban+"\t\t"+xm.congsuat);
			}
		}
		if(listxt.size()>0) {
			System.out.println("-----Danh sach phuong tien xe tai-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		TRONG TAI");
			for(int i=0;i<listoto.size();i++) {
				xt = listxt.get(i);
				System.out.println((i+1)+"\t\t"+xt.HSX+"\t\t"+xt.Mau+"\t\t"+xt.namXS+"\t\t"+xt.Giaban+"\t\t"+xt.trongtai);
			}
		}
	}
	
	static void timptgt() {
		String mautim;
		System.out.print("NHAP MAU XE CAN TIM: "); mautim=Inln.nextLine();
		System.out.println("DANH SACH PHUONG TIM GIAU THONG CO MAU  "+mautim+": ");
		if(listoto.size()>0) {
			System.out.println("-----DANH SACH PHUONG TIEN O TO-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		SO CHO NGOI		KIEU DONG CO");
			for(int i=0;i<listoto.size();i++) {
				O = listoto.get(i);
				if(mautim.compareTo(O.Mau)==0) {
					System.out.println((i+1)+"\t\t"+O.HSX+"\t\t"+O.Mau+"\t\t"+O.namXS+"\t\t"+O.Giaban+"\t\t"+O.scn+"\t\t"+O.KieuDC);
				}
			}
		}
		if(listxm.size()>0) {
			System.out.println("-----DANH SACH PHUONG TIEN XE MAY-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		CONG SUAT");
			for(int i=0;i<listoto.size();i++) {
				xm = listxm.get(i);
				if(mautim.compareTo(xm.Mau)==0) {
					System.out.println((i+1)+"\t\t"+xm.HSX+"\t\t"+xm.Mau+"\t\t"+xm.namXS+"\t\t"+xm.Giaban+"\t\t"+xm.congsuat);
				}
			}
		}
		if(listxt.size()>0) {
			System.out.println("-----Danh SANH SACXH PHUONG TIEN XE TAI-----");
			System.out.println("STT		HANG SAN XUAT		mau		NAM SAN XUAT	GIA BAN		TRONG TAI");
			for(int i=0;i<listoto.size();i++) {
				xt = listxt.get(i);
				if(mautim.compareTo(xt.Mau)==0) {
					System.out.println((i+1)+"\t\t"+xt.HSX+"\t\t"+xt.Mau+"\t\t"+xt.namXS+"\t\t"+xt.Giaban+"\t\t"+xt.trongtai);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		nhapds();
		xuatds();
		timptgt();
	}
}