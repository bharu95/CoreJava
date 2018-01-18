import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.midi.Synthesizer;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String pathName= "resources";
		File f=new File(pathName);
		//boolean b=f.mkdir();
		if(f.mkdir()) {
			System.out.println("directory is created");
			String path=f.getCanonicalPath();
			System.out.println(path);
			path=path+"/"+"file.txt";
			File ff=new File(path);
			//boolean bb = ff.createNewFile();
			if(ff.createNewFile()) {
				System.out.println("text file is created");
				FileOutputStream fos=new FileOutputStream(ff);
				String message="hello world!!";
				byte[] bbb=message.getBytes();
				fos.write(bbb);
			}else {
				System.out.println("already there..");
			}
		}else
			System.out.println("directory alreay there..");
	}

}
