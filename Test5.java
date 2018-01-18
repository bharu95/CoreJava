import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test5 {
	
	public static void main(String[] args) {
		
		Comparator c=new MyComparator();
		
		TreeSet<Integer> emp=new TreeSet<Integer>(c);
		emp.add(1);
		emp.add(2);
		emp.add(3);
		
		System.out.println(emp);
		
		
		
		
		
	}

}
