import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		

		
				List<Employee> a=new ArrayList<Employee>();
				a.add(new Employee(1001,"bhargav",1000.0));
				a.add(new Employee(1002,"raju",5000.0));
				/*a.add("bhargav");
				a.add('a');*/
				a.add(new Employee(1003,"mouli",50422.0));
				//a.add(10010.1);
				a.add(new Employee(1004,"saad",40000.1));
				Collections.sort(a);
				//System.out.println(a);
				/*System.out.println("================");
				for(int i=0;i<a.size();i++) {
					System.out.println(a.get(i));
				}*/
				//System.out.println("================");
				for(Employee b:a) {
					System.out.println(b);
				}
				
			}

		

	}


