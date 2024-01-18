import java.io.*;

class FileDemo{
	public static void main(String[] args)throws IOException{
		File file = new File("Folder1");
		file.mkdir();
		
		File file1 = new File("Folder1","file1");
		file1.createNewFile();
		
		File file2 = new File("Folder1","file2");
		file2.createNewFile();
		
		File file3 = new File("Folder1","file3");
		file3.createNewFile();
		
		File file4 = new File("Folder1","file4");
		file4.createNewFile();
		
		File file5 = new File("Folder1","file5");
		file5.createNewFile();
		
		File[] files = file.listFiles();

		int count = 0;
		for(File i : files){
		
			System.out.println(i);
			if(i.isFile()){
				
				count++;
			}
		}
		System.out.println("Total files are :"+count);




	}
}
