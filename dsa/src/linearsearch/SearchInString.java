package linearsearch;

import java.util.Arrays;

public class SearchInString {
    public static boolean search(String str, char key){

        if (str == null) {
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == key){
                return true;
            }
        }
        return false;
    }
    public static boolean search1(String str, char key){

        if (str == null) {
            return false;
        }
        for(Character s : str.toCharArray() ){
            if(s == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "tejas";
        System.out.println(name);
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));

      
        char key = 'a';
       
        System.out.println(search(name, key));
        System.out.println(search1(name, key));
        
    }
}
