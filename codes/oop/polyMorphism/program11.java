class Match{

	void matchType(){
		System.out.println("T20/oneDay/Test");
	}
}
class IplMatch extends Match{

	void matchType(){
	
		System.out.println("T20");
	}
}

class TestMatch extends Match{

	void matchType(){
	
		System.out.println("Test");
	}
}
class Client{

	public static void main(String[] args){
	
		Match type1 = new IplMatch();
		type1.matchType();

		Match type2 = new TestMatch();
		type2.matchType();
	}
}
