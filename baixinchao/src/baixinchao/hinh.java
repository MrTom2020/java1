package baixinchao;



public abstract class hinh
{
	protected float c,r;
	public hinh()
	{
		
	}
	public hinh(float C,float R)
	{
		this.c = C;
		this.r = R;
	}
	protected abstract float dientich();
	
	public abstract float chuvi();
	
	public void xuatttinh()
	{
		System.out.print("Dien tich  cua hinh la\n");
		System.out.print(dientich());
		System.out.print("\nChu vi  cua hinh la\n");
		System.out.print(chuvi());
	}

}
