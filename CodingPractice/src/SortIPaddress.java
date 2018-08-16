import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortIPaddress {
	 static Long toNumeric(String ip) {
		    Scanner sc = new Scanner(ip).useDelimiter("\\.");
		    Long l = (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8)
		        + (sc.nextLong());
		    
		    sc.close();
		    return l;
		  }

		  public static void main(String[] args) {
		    Comparator<String> ipComparator = new Comparator<String>() 
		    {
		      @Override
		      public int compare(String ip1, String ip2) {
		        return toNumeric(ip1).compareTo(toNumeric(ip2));
		      }
		    };
		    SortedSet<String> ips = new TreeSet<String>(ipComparator);
		    ips.addAll(Arrays.asList("192.168.0.1", "192.168.0.2", "192.168.0.9",
		        "9.9.9.9","127.0.0.1"));
		    System.out.println(ips);
		  }
}
