// Adding userdefine object to collection

import java.util.*;

class CricPlayer{

	int jerNo = 0;
	String name = null;
	CricPlayer(int jerNo, String name){
	
		this.jerNo = jerNo;
		this.name = name;
	}
	public String toString(){
		return jerNo +" "+ name;
	}
}

class ArrayListDemo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(7,"MSD"));
		al.add(new CricPlayer(10,"Sachin"));
		al.add(new CricPlayer(18,"Virat"));

		System.out.println(al);
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}



	}
}
