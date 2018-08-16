public class SmallestNumber
{
public static void main(String[] args) 
{
    int[] arr  = {5,2,6,7,4}; 
    int smallest=Integer.MAX_VALUE; 
    System.out.println("length is: "+arr.length);
    for (int i = 0; i < arr.length; i++)
    {
            if (arr[i] < smallest)
            {
                smallest = arr[i];
                
            }
           
      }
    System.out.println("Smallest number is: "+smallest);
    
}
}