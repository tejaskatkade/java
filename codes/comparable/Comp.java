package comparable;

public class Comp implements Comparable<Comp> {
    
    private int id;
    private String name;
    private double sal;


    Comp(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String toString(){
        return "[ Id : "+id+ " Name : "+name+" Salary : "+sal+" ]\n";
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setSal(double sal){
        this.sal = sal;
    }

    double getSal(){
        return sal;
    }

    @Override
    public int compareTo(Comp o) {
        return this.id - o.id;
        
    }
}
