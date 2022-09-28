package Class01;


class CRectangle
 {
	int width;
	int height;
	 
	public CRectangle(int w, int h)      // (a)
	  {
	      width = w;
	      height = h;
	  }
	
	public void show()
	   {
	       System.out.println("width="+width+", height="+height);
	   }
 }
 	

public class Class01
{
	public static void main(String args[])
	   {
		CRectangle rect1=new CRectangle(10,8);		// (b)
		rect1.show();
	   }
	}
