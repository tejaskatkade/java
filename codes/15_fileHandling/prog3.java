import java.io.*;

class FileDemo{

	public static void main(String args[])throws IOException{
	
		File file = new File("TestFolder","file");
		file.createNewFile();

	}
}
