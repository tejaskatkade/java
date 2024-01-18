import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{
	
		File file1 = new File("Folder");
		if(file1.mkdir()){
			System.out.println("Folder "+ file1.getName() +" created ");
		}

		File file2 = new File("Folder","file.txt");
		if(file2.createNewFile()){
		
			System.out.println("New "+ file2.getName() + " file created");
			
			System.out.println("getName()");
			System.out.println(file2.getName());

			System.out.println("getParent()");
			System.out.println(file2.getParent());
			
			System.out.println("getPath()");
			System.out.println(file2.getPath());
			
			System.out.println("getAbsolutePath()");
			System.out.println(file2.getAbsolutePath());


			System.out.println("canRead()");
			System.out.println(file2.canRead());
			
			System.out.println("canWrite()");
			System.out.println(file2.canWrite());


			System.out.println("isDirectory()");
			System.out.println(file2.isDirectory());

			System.out.println("isFile()");
			System.out.println(file2.isFile());
			

			System.out.println("isHidden()");
			System.out.println(file2.isHidden());
		}else{
		
			System.out.println("file not created");
		}



	}
}
