// method: public int compareTo(String str2);
// Description: It compare the str1 and str2 (case sensitive)
// if both string are equal it returns 0 otherwise it returns the comparison
// Parameter: String  (second string)
// Argunment: integer (ite is difference between 2 strings)


class MethodsDemo{

	public static void main(String[] args){
	
		String str1 = "Tejas";
		String str2 = "tejas";

		System.out.println(str1.compareTo(str2));
	}
}
