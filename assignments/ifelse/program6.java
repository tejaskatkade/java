// 6.

class Demo{
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int c = 2;


		if(a == b){
			if(a>c){	
				System.out.println(a+" and "+b+"are equal and greater than "+c);
			}else{
				System.out.println(a+" and "+b+"are equal ans less than "+c);
			}
		}else if(b == c){
			if(b>a){
				System.out.println(b +" and "+c+" are equal and greater than "+a);
			}else{
				System.out.println(b+" and "+c+" are equal and less than "+a);
			}
		}else if(a == c){
			if(a>b){
				System.out.println(a+" and "+c+"are equal and greater than "+b);
			}else{
				System.out.println(a+" and "+c+" are equal and less than "+b);
			}
		}else if(a > b && a>c){
				System.out.println(a+" is greater");
		}else if(b > a && b > c){
				System.out.println(b +" is greater");
		}else if(a < c && b < c){
				System.out.println(c+" is greater");
		}
	
	}
}
