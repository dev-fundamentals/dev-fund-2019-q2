package main.java.MiguelVega.Figures;

public abstract class GeometricFigure implements Figure 
{
	private String tag;

	public GeometricFigure(String tag)
	{
		this.tag=tag;
	}
		
	@Override
	public String getTag() {
		// TODO Auto-generated method stub
		return tag;
	}

	public void setTag(String tag) {
	    this.tag = tag;
	    }
	
	@Override
	abstract public String getFigureType();	

	@Override
	abstract public double area();

	@Override
	abstract public void drawTxt();

	@Override
	final public void printDescription()
	{
		// TODO Auto-generated method stub
		System.out.println("Tag:"+getTag());
		System.out.println("Figure Type:"+getFigureType());
		System.out.println("Area: "+area());		
	}	
}
