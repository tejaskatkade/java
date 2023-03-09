// short : size => 2 byte

class Demo{
	public static void main(String[] args){
		
		short var1 = 18;
		short var2 = 16;

		System.out.println(var1);
		System.out.println(var2);

		var1= var1 + var2; //Updating the value of var1 having datatype short;
				   // Bydefault it considers the data type int		
		System.out.println(var1);
		System.out.println(var2);

	}
}

//error: incompatible types: possible lossy conversion from int to byte
