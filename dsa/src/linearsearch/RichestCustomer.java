package linearsearch;

public class RichestCustomer {

    public static int maximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }
            if(maxWealth < wealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {

        int[][] accounts ={
            {1,2,3},  // 6
            {9,1,6},  // 16
            {3,7,5},  // 15
            {6,9,0}   // 15
        };
        System.out.println(maximumWealth(accounts));
    }
}
