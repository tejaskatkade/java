// float : size => 4 bytes

class Demo{
	public static void main(String[] args){
	
	//	float f1 = 10.5;  //error: incompatible types: possible lossy conversion from double to float
		float f2 = 10.5f;  //solution to above error : Bydefault java consider it as double.
		
		System.out.println(f2);
	}
}
