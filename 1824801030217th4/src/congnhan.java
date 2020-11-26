
public class congnhan extends canbo
{

	private int bacluong = 0;
	private String hoten = "",diachi = "";
	private double tuoi = 0;
	private boolean gioitinh = false;
	@Override
	protected String getHoten()
	{
		return this.hoten;
	}
	public int getbacluong()
	{
		return this.bacluong;
	}
	public void setbacluong(int bacluong)
	{
		this.bacluong = bacluong;
	}
	@Override
	protected void setHoten(String HOTEN)
	{
		this.hoten = HOTEN;
		
	}
	public congnhan()
	{
		
	}
	public congnhan(String hoten,String diachi,double tuoi,boolean gioitinh,int bacluong)
	{
		this.hoten = hoten;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
		this.bacluong = bacluong;
		this.tuoi = tuoi;
	}
	@Override
	protected String getDiachi()
	{
		return this.diachi;
	}

	@Override
	protected void setDiachi(String diachi)
	{
		this.diachi = diachi;
		
	}

	@Override
	protected double gettuoi() 
	{
		return this.tuoi;
	}

	@Override
	protected void setTuoi(double tuoi) 
	{
		this.tuoi = tuoi;
		
	}

	@Override
	protected boolean getgioitinh()
	{
		return this.gioitinh;
	}

	@Override
	protected void setgioitinh(boolean gioitinh)
	{
		this.gioitinh = gioitinh;
	}

}
