// 5 

class Demo{
	public static void main(String[] args){
		int x = 3;
		if(x>0 && x<13){
			if(x == 1){
				System.out.println("jan has 31 days");
			}else if(x==2) {
				System.out.println("feb has 28 days");
			}else if(x==3) {
				System.out.println("march has 31 days");
			}else if(x==4) {
				System.out.println("april has 30 days");
			}else if(x==5) {
				System.out.println("may has 31 days");
			}else if(x==6) {
				System.out.println("june has 30 days");
			}else if(x==7) {
				System.out.println("july has 31 days");
			}else if(x==8) {
				System.out.println("aug has 31 days");
			}else if(x==9) {
				System.out.println("sept has 30 days");
			}else if(x==10) {
				System.out.println("oct has 31 days");
			}else if(x==11) {
				System.out.println("nov has 30 days");
			}else {
				System.out.println("dec has 31 days");
			}
		}else{
				System.out.println("invalid input");
		
		}
	}
}
