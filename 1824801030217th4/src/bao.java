
public class bao implements tailieu{

	private String MTL = "",TenNXB = "",soxb = "",loai ="",ngayphathanh = "";
	@Override
	public void xuat() 
	{
		System.out.println(this.getMatailieu() + "\t " + this.getTenNXB() + "\t\t\t " + this.getsophathanh() + "\t\t\t " + this.getloai());
	}
	public String getngayphathanh()
	{
		return this.ngayphathanh;
	}
	public bao()
	{
		
	}
	public bao(String MTL,String TNXB,String SOXB,String loai,String Ngayph)
	{
		this.MTL = MTL;
		this.TenNXB = TNXB;
		this.soxb = SOXB;
		this.loai = loai;
		this.ngayphathanh = Ngayph;
	}
	public void setngayphathanh(String nph)
	{
		this.ngayphathanh = nph;
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
