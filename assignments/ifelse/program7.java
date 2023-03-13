// 7.

class Demo{
	public static void main(String[] args){
	
		float sp = 1000f;
		float cp = 900f;
		float ans = sp-cp;	
		

		if(ans > 0){
			
			System.out.println(" There is profit of "+ans);

		}else if(ans < 0){
			
			System.out.println("Loss of "+ans);

		}else{
			
			System.out.println("No profit No Loss");

		}
	}
}
