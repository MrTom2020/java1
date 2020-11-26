package baixinchao;

public class vuong extends hinh
{
	private float c,r;
	public vuong()
	{
		
	}
	public vuong(float A,float B)
	{
		this.c = A;
		this.r = B;
	}
	
	@Override
	protected float dientich() {
		return c * r;
	}

	@Override
	public float chuvi() {
		// TODO Auto-generated method stub
		return (float)(c + r) /2;
	}

}
