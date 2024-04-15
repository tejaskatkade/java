package Collection.set;

import java.util.LinkedHashSet;

class CricketPlayer {
    int jerNo = 0;
    String playerName = null;

    CricketPlayer(int jerNo, String playerName){
        this.jerNo = jerNo;
        this.playerName = playerName;
    }
    @Override
    public String toString() {
        return "[ jerNo :"+ jerNo+" Name "+playerName+"]  ";
    }
}

class HashsetDemo{
    public static void main(String[] args) {
        LinkedHashSet<CricketPlayer> hs = new LinkedHashSet<>();

        hs.add(new CricketPlayer(18,"Virat"));
        hs.add(new CricketPlayer(7,"MSD"));
        hs.add(new CricketPlayer(45,"rohit"));
        hs.add(new CricketPlayer(7,"Dhoni"));

        System.out.println(hs);

        //[[ jerNo :18 Name Virat]  , [ jerNo :7 Name MSD]  , [ jerNo :45 Name rohit]  , [ jerNo :7 Name Dhoni]  ]
    }    
}
