package algorithim;

public class FibbonaciSeries1 {
	
	public static void main(String[] args) {
		
		int a=0,b=1;
		System.out.println("Fibbonaci Numbers Display Below:=");
		while(a<50)
		{
			System.out.print(a+" ");
			int result=a+b;
			a=b;
			b=result;
			
		}
	}
}
