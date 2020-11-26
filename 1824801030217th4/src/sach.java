
public class sach implements tailieu {

	private String MTL = "",TenNXB = "",soxb = "",loai ="",tacgia =" ";
	private int sotrang = 0;
	@Override
	public void xuat() 
	{
		System.out.println(this.getMatailieu() + "\t " + this.getTenNXB() + "\t\t\t " + this.getsophathanh() + "\t\t\t " + this.getloai());
	}
	public sach()
	{
		
	}
	public sach(String MTL,String TNXB,String SXB,String LOAI,String TACGIA,int ST)
	{
		this.MTL = MTL;
		this.TenNXB = TNXB;
		this.soxb = SXB;
		this.loai = LOAI;
		this.tacgia = TACGIA;
		this.sotrang = ST;
	}
	public String gettacgia()
	{
		return this.tacgia;
	}
	public void settacgia(String tg)
	{
		this.tacgia = tg;
	}
	public int gettrang()
	{
		return this.sotrang;
	}
	public void settrang(int st)
	{
		this.sotrang = st;
	}
	public String getloai()
	{
		return this.loai;
	}
	public void setloai(String loai)
	{
		this.loai = loai;
	}
	public String getMatailieu()
	{
		return this.MTL;
	}
	public void setMatailieu(String mtl)
	{
		this.MTL = mtl;
	}
	public String getTenNXB()
	{
		return this.TenNXB;
	}
	public void setTenNXB(String tnxb)
	{
		this.TenNXB = tnxb;
	}
	public String getsophathanh()
	{
		return this.soxb;
	}
	public void setsophathanh(String soph)
	{
		this.soxb = soph;
	}
	
	

}
