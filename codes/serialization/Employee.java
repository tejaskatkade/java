package serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String name;
    private String company;
    transient private String city;

    Employee(int id, String name, String company, String city){
        this.id = id;
        this.city = city;
        this.company = company;
        this.name = name;
    }

    public int getId(){
        return id;
    } 
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public String getCity(){
        return city;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", city=" + city + "]";
    }

    
}
