package baixinchao;

public class hinhtron extends hinh
{
	private float r;
	public hinhtron(float r)
	{
		this.r = r;
	}

	@Override
	protected float dientich() 
	{
		return (float) (r * 3.14 * r);
	}

	@Override
	public float chuvi() {
		return (float)(r * 2 * 3.14);
	}

}
