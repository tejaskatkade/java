//7. Reverse integer

class ArrayDemo{
    public static int reverse(int x) {
        int num = 0;
        while(x != 0){
            int rem = x%10;
            if(num < Integer.MIN_VALUE/10 || num > Integer.MAX_VALUE/10){
                 return 0;
            }
            num = num*10 + rem;
            x = x/10;
        }
        return num;
    }

    public static void main(String[] args){
    
	    
	    System.out.println(reverse(7839));
    }
}

