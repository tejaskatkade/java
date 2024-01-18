import java.io.*;

class FileDemo{
	public static void main(String[] args)throws IOException{
		File file = new File("Folder");
		file.mkdir();
		
		File file1 = new File("Folder","file1");
		file1.createNewFile();
		
		File file2 = new File("Folder","file2");
		file2.createNewFile();
		
		File file3 = new File("Folder","file3");
		file3.createNewFile();
		
		File file4 = new File("Folder","file4");
		file4.createNewFile();
		
		File file5 = new File("Folder","file5");
		file5.createNewFile();

		//System.out.println(file.lastModified());
		
		String[] files = file.list();

		for(String i : files){
		
			System.out.println(i);
		}


	}
}
