package baixinchao;

public class hinhthang extends hinh
{

	private float c,dl,db,cb;
	public hinhthang(float A,float B,float C,float D)
	{
		this.dl = A;
		this.db = B;
		this.c = c;
		this.cb = D;
	}
	@Override
	protected float dientich() {
		// TODO Auto-generated method stub
		return (float)(c *((dl +db)/2));
	}

	@Override
	public float chuvi() 
	{
		// TODO Auto-generated method stub
		return c + dl+ cb +db;
	}
	

}
