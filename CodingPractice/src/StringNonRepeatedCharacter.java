import java.util.*;
public class StringNonRepeatedCharacter {
	public static void main(String[] args) {
	String str="ccdhhp";
	nonRepeat(str);
	}
	static void nonRepeat(String str)
	{
		String content[]=str.split("");
		HashMap<String,Integer> hm=new HashMap<>();
		int count=0;
		for(int i=0;i<content.length;i++)
		{
			String cleter=content[i];
			if(!hm.containsKey(cleter)){
				hm.put(cleter, 1);
				count=1;
			}else{
				count+=1;
				hm.put(cleter, count);
			}
		}
		System.out.println(hm);
		for(int i=0;i<content.length;i++){
			String s1=content[i];
			if(hm.get(s1)==1){
				System.out.println(s1);
				//break;
			}
		}
	}
}
