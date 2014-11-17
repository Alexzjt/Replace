import java.io.FileNotFoundException;
import java.io.IOException;


public class menu {
	public static void main(String args[]){
		Find f=new Find();
		String path=Config.in_file_path;
		try {
			f.readfile(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
