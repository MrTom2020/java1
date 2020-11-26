
public class nhanvien extends canbo
{
	private String hoten = "",diachi = "",congviec = "";
	private double tuoi = 0;
	private boolean gioitinh = false;
	@Override
	protected String getHoten() 
	{
		// TODO Auto-generated method stub
		return this.hoten;
	}

	@Override
	protected void setHoten(String HOTEN)
	{
		// TODO Auto-generated method stub
		this.hoten = HOTEN;
		
	}

	@Override
	protected String getDiachi()
	{
		// TODO Auto-generated method stub
		return this.diachi;
	}

	@Override
	protected void setDiachi(String diachi)
	{
		// TODO Auto-generated method stub
		this.diachi = diachi;
		
	}

	@Override
	protected double gettuoi() 
	{
		// TODO Auto-generated method stub
		return this.tuoi;
	}

	@Override
	protected void setTuoi(double tuoi) 
	{
		// TODO Auto-generated method stub
		this.tuoi = tuoi;
		
	}
	public nhanvien()
	{
		
	}
	public nhanvien(String hoten,String diachi,double tuoi,boolean gioitinh,String congviec)
	{
		this.hoten = hoten;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
		this.congviec = congviec;
		this.tuoi = tuoi;
	}
	@Override
	protected boolean getgioitinh() 
	{
		// TODO Auto-generated method stub
		return this.gioitinh;
	}

	@Override
	protected void setgioitinh(boolean gioitinh)
	{
		// TODO Auto-generated method stub
		this.gioitinh = gioitinh;
		
	}
	public String getcongviec() 
	{
		return this.congviec;
	}
	public void setcongviec(String congviec)
	{
		this.congviec = congviec;
	}

}
