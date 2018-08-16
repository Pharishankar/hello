
public class DuplicateCharacterFind {
	public static void main(String[] args) {
		String s1="harishankar";
		//String s1=str.toLowerCase();
		//System.out.println(s1);
		
		int count=0;
		char ch[]=s1.toCharArray();
		System.out.println("Duplicates character are:");
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(ch[i] == ch[j]){
					System.out.print(ch[j]+" ");
					count++;
					break;
				}
			}
		
		}
		System.out.println("\nNumber of duplicate letter is : "+count);
	}
}