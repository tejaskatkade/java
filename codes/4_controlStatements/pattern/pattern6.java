/*
 4444333322221111
 444333222111
 44332211
 4321
*/

class Demo{

	public static void main(String[] args){
	
		int row =4;
		int a = row;
		
		for(int i=0; i<row; i++)
		{
			int num = row;
			for(int j=1; j<=row*a; j++){
			
				System.out.print(num);
				if(j%a==0){
					num--;
				}
			}
			System.out.println();
			a--;
		}
	}
}
