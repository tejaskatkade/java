public class Student {
    private int rollNo;
    private String name;
    private String city;

    public Student setRollNo(int rollNo){
        this.rollNo = rollNo;
        return this;
    }
    public Student setName(String name){
        this.name = name ;
        return this;
    }
    public Student setCity(String city){
        this.city = city;
        return this;
    }

    public String  toString(){
        return "Roll no: "+rollNo+" Name : "+name+" City : "+city;
    }

    
    public static Student of(){
        return new Student();
    }
}
