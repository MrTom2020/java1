
public class kysu extends canbo {

	private String hoten = "",diachi = "",nganhdaotao = "";
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
	public kysu()
	{
		
	}
	public kysu(String hoten,String diachi,double tuoi,boolean gioitinh,String nganhdaotao)
	{
		this.hoten = hoten;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
		this.nganhdaotao = nganhdaotao;
		this.tuoi = tuoi;
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
	public String getnganhhoc(String nganhhoc)
	{
		return this.nganhdaotao;
	}
	public void setnganhhoc(String nganhhoc)
	{
		this.nganhdaotao = nganhhoc;
	}
}
