package linearsearch;

public class EvenDigits {
    
    public static int digits1(int number){
        int length = 0;
        if (number < 0) {
            number = number * -1;
        }

        if(number == 0){
            return 1;
        }
        while (number > 0) {
            number = number/10;
            length++;
        }
        return length;

    }
    public static int digits(int number){
        if (number < 0) {
            number = number * -1;
        }
        return (int)Math.log10(number) + 1;
    }
    public static int evenDigits(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(digits(arr[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={234,1,22,42,5};
        System.out.println(digits(5785));
        System.out.println(evenDigits(arr));
    }
}
