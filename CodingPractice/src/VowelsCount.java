//Java Program to count vowels and consonants in String


package algorithim;

public class VowelsCount {
	public static void main(String[] args) {
		
		String str="How many vowels in this String";
		int count=0;
		char[] ch=str.toCharArray();
		
		for (char c : ch) {
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}//switch
		}//for-loop
		System.out.println(count);
		
	}//main
}//class
