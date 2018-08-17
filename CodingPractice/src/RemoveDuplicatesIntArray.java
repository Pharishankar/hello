import java.util.Arrays;


//Remove  Duplicates from Integer Array 

public class RemoveDuplicatesIntArray {
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,1,3,5};
		System.out.println("Before remove Duplicates:--"+Arrays.toString(arr));
		System.out.println("After remove Duplicates:--"+Arrays.toString(removeDuplictes(arr)));
	}
	
	/*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */

	
	public static int[] removeDuplictes(int[] arr2)
	{
		//sorting array to bring duplicates together
		Arrays.sort(arr2);
		int[] result=new int[arr2.length];
		int previous=arr2[0];
		result[0]=previous;
		
		for (int i = 1	; i < arr2.length; i++) {
			int ch=arr2[i];
			
			if (previous != ch) {
				result[i]=ch;
			}
			previous=ch;
		}
		return result;
		
	}
}
