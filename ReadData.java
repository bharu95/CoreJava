import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("file1.txt");
			int ch;
			while((ch=fis.read())!=-1){
				System.out.println((char)ch);
			}
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
