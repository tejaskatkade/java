//Given the temperature of person in farenheit print whether the person has high, normal or low temperature.
//  temp > 98.6            == high
//  98.6 <= temp <= 90.0   == normal
//  temp < 98.0    	   == low
//

class Demo{
	public static void main(String[] args){
		float temp = 98.5f;

		if(temp > 98.6f){
			System.out.println("Temp is high");
		}else if(temp > 98.0f){
			System.out.println("Temp is Normal");
		}else{
			System.out.println("Temp is low");
		}
	}
}
