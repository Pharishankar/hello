public class UperrToLowercase {
	public static void main(String[] args) {
		String str="JAVA";
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(ch>65 && ch<91){
				ch=ch+32;
				System.out.println((char)ch);
			}
			else if(ch>96 && ch<123){
				ch=ch-32;
				System.out.println((char)ch);
			}
			if(ch==32){
				System.out.println(" ");
			}
		}
		System.out.println(" ");
		
	}
}
