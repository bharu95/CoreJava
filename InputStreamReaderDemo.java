import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		/*
		 * FileInputStream fis = null; InputStreamReader isr = null;
		 */
		BufferedReader br = null;

		try {
			/*
			 * fis = new FileInputStream("file1.txt"); isr = new
			 * InputStreamReader(fis);
			 */
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter u r empid:");
			String id = br.readLine();
			int eid = Integer.parseInt(id);
			System.out.println("enter u r name:");
			String name = br.readLine();
			System.out.println("entre u r salary:");
			String sal = br.readLine();
			double esal = Double.parseDouble(sal);
			System.out.println("u r empid is:" + eid + "\nu r name is:" + name + "\nu r salary:" + esal);
			PrintWriter out = new PrintWriter(new FileOutputStream("file.txt",true));
			out.println(eid + "\t" + name + "\t" + esal);
			out.close();
			/*
			 * String line = br.readLine(); while (line != null) {
			 * System.out.println(line); line = br.readLine(); }
			 */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * finally { try { fis.close(); } catch (IOException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
	}
}

// }
