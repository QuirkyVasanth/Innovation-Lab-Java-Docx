package programs;

public class Day3_Constructors {

	static int minimumDiscount;
	
	
	
	public Day3_Constructors() {
		System.out.println("Default Constructor");
	}
	public Day3_Constructors(int a,int b)
	{
		this.minimumDiscount=a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Day3_Constructors d=new Day3_Constructors(12,45);
		Day3_Constructors d1=new Day3_Constructors(20,90);
		Day3_Constructors d2=new Day3_Constructors(30,100);
//       // d.minimumDiscount=90;
//        System.out.println("person d discount"+d.minimumDiscount);
//        System.out.println("person d1 discount"+d1.minimumDiscount);
//		
//        System.out.println("person d2 discount"+d2.minimumDiscount);
//        
	}
}
