import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer ob1, Integer ob2) {
		
		if(ob1>ob2) {
			return -1;
		}else if(ob1<ob2) {
			return 1;
		}
			return 0;
			
			
	}
	
	
	

}
