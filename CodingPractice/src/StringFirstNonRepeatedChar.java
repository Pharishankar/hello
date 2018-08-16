
public class StringFirstNonRepeatedChar {
	public static void main(String[] args) {
		String str="aaccssaafppl";
		int count=0;
		for(char ch : str.toCharArray())
		{
			if(str.indexOf(ch) == str.lastIndexOf(ch))
			{
				System.out.println(ch);
				//count++;
				break;
			}
		}
		//System.out.println(count);
	}
}
