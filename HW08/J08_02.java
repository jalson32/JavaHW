class Cbbb
{
	double x;
	double y;
}

public class J08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb obj1;
		Cbbb obj2;
		Cbbb avg;
		
		obj1 = new Cbbb();
		obj2 = new Cbbb();
		avg = new Cbbb();
		
		
		obj1.x = 5.2;
		obj1.y = 3.9;
		
		obj2.x = 6.5;
		obj2.y = 4.6;
		
		avg.x =(obj1.x + obj2.x)/2;
		avg.y =(obj1.y + obj2.y)/2;
		
		 System.out.print("obj1 x="+obj1.x);
		 System.out.println(", obj1 y="+obj1.y);
		 System.out.print("obj2 x="+obj2.x);
		 System.out.println(", obj2 y="+obj2.y);
		 System.out.print("avg x="+avg.x);
		 System.out.println(", avg y="+avg.y);
		
	}

}
