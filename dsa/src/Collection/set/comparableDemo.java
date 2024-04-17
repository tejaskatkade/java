package Collection.set;

import java.util.TreeSet;

class Movies implements Comparable<Movies> {
    String movieName;
    int year;

    Movies(String movieName, int year){

        this.movieName = movieName;
        this.year = year;
    }

    @Override
    public int compareTo(Movies o) {
        // return movieName.compareTo(o.movieName); // asc
        return o.movieName.compareTo(movieName); // dsc
        
        //return -(movieName.compareTo(o.movieName)); // dsc

        
    }

    public String toString(){
        return "[ Movie : "+ movieName +" year : "+year+"] ";
    }

}

class ComaprableDemo {
    public static void main(String[] args) {
     
        TreeSet<Movies> ts = new TreeSet<>();

        ts.add(new Movies("Fighter", 2024));
        ts.add(new Movies("Guru", 2007));
        ts.add(new Movies("Ye Jawani hey Diwani", 2011));
        
        System.out.println(ts);
    }
}
