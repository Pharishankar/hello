package algorithim;

//write programe display fibbonaci sequence upto 7 digits

//using while loop:-
public class FibbonaciSeries {
	
	public static void main(String[] args) {
		int num1=0,num2=1, count=7;
		int i=1;
		while (i<=count) {
			System.out.print(num1+" ");
			int sumOfPrevTwo=num1+num2;
			num1=num2;
			num2=sumOfPrevTwo;
			i++;
		}
	}
}
//using For loop:-
/*public class FibbonaciSeries {
	
	public static void main(String[] args) {
		int num1=0,num2=1, count=7;
		for (int i =1; i <=count; ++i) {
			System.out.print(num1+" ");
			int result=num1+num2;
			num1=num2;
			num2=result;
		}
	}
}	*/