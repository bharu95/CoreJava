
public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double sal;
	public Employee(int id,String name,double sal) {
		this.id=id;	
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
}
