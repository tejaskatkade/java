// LinkedHashSet with userdefine object

import java.util.*;

class CricPlayer{

	int jerNo = 0;
	String pName = null;

	CricPlayer(int jerNo, String pName){
		this.jerNo = jerNo;
		this.pName = pName;
	}
	public String toString(){
		return jerNo +" "+pName;
	}
}
class HashSetDemo{

	public static void main(String[] args){
	
		LinkedHashSet ls = new LinkedHashSet();	

		ls.add(new CricPlayer(07,"Dhoni"));
		ls.add(new CricPlayer(10,"Sachin"));
		ls.add(new CricPlayer(18,"virat"));
		ls.add(new CricPlayer(07,"Dhoni"));

		System.out.println(ls);  // [7 Dhoni, 10 Sachin, 18 virat, 7 Dhoni]
					 // as our class is not comparing the objects data
					 // so duplicate data is also printing
	}
}
