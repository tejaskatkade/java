// Overloading

class IPL{

	void matchInfo(String team1, String team2){
	
		System.out.println(team1 + " vs "+ team2);
	}
	void matchInfo(String team1, String team2, String venue){
	
		System.out.println(team1+" vs "+team2 + " Venue = "+ venue);
	}
}
class Client{

	public static void main(String[] args){
	
		IPL ipl2023 = new IPL();
		ipl2023.matchInfo("GT","CSK");
		ipl2023.matchInfo("GT","CSK","Narendra Modi Stadium");

	}
}
