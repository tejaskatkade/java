import java.util.*;
class P4{
	static void TOH(int N,char A,char B,char C){
		if(N>0){
			TOH(N-1,A,C,B);
			System.out.println(A+"->"+C);
			TOH(N-1,B,A,C);
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		TOH(N,'A','B','C');

	}
}
