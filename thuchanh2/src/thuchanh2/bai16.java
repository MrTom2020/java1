package thuchanh2;

public class bai16 
{
	String chuoi_can_kiem_tra = "E:/Cong viec/day hoc/Java co ban/thuc hanh/bai thuc hanh 2.pdf";
	int dem = 0,laychuoidau =0,laycuoi = 0,m = 0,ten = 0,duong = 0;
	int aa[] = {1, 2 ,3 ,43, 4};
	String mr ="",tentaptin ="",duongdan ="";
	public static void main(String[] args)
	{
		bai16 b16 = new bai16();
		for(int k =0; k < b16.chuoi_can_kiem_tra.length();++k)
		{
			
			if(b16.chuoi_can_kiem_tra.charAt(k) == '/')
			{
				b16.dem++;
			}
			if(b16.dem != 5)
			{
				b16.laychuoidau +=1;
			}
			
		}
		//System.out.print(b16.dem);
		b16.duong = b16.chuoi_can_kiem_tra.indexOf("E:");
		int d =b16.laychuoidau + 1;
		b16.laycuoi = b16.chuoi_can_kiem_tra.indexOf(".");
		String kk = b16.chuoi_can_kiem_tra.substring(d, b16.laycuoi);
		String duongdan = b16.chuoi_can_kiem_tra.substring(b16.duong, d);
		String morongg = b16.chuoi_can_kiem_tra.substring(b16.laycuoi);
		System.out.println("Duong dan tap tin : " + duongdan);
		System.out.println("Ten tap tin : " + kk);
		System.out.println("Phan mo rong : " + morongg);
		System.out.println(b16.aa.length);
		for(int i = 0;i < b16.aa.length;++i)
		{
			System.out.println(i);
		}
		
	}
	private char[] charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
