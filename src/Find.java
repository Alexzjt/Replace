import java.io.*;

public class Find extends AbsReadFile {

	
	@Override
	public boolean readfile(String filepath) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		return super.readfile(filepath);
	}

	@Override
	public void dealWithFile(File file) {
		// TODO Auto-generated method stub
		FileReader fr;
		
			try {
				fr = new FileReader(file);
				BufferedReader reader = new BufferedReader(fr);
				String line;
				File fileout = new File(Config.out_file_path+"\\"+file.getName());
				System.out.println("处理文件"+file.getName());
				FileWriter fw = new FileWriter(fileout);
				int x=0,y=0;
				while((line = reader.readLine())!=null)
				{
					if("".equals(line.trim())||"graph adjgraph {".equals(line)||"{".equals(line.trim()))
					{
						continue;
					}
					int first_heng=line.indexOf("-");
					int first_kuohao=line.indexOf("[");
					int first_dengyu=line.indexOf("=");
					if(first_heng<0||first_kuohao<0||first_dengyu<0)
					{
						continue;
					}
					fw.write(line.substring(2, first_heng)+"\t"+line.substring(first_heng+3,first_kuohao-1)+"\t"+line.charAt(first_dengyu+1)+"\r\n");
					
				}
				fw.close();
				fr.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		

	}
}
