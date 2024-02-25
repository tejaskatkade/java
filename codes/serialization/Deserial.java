package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args)throws Exception{

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee emp = (Employee)ois.readObject();

        System.out.println("Id : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Company :"+emp.getCompany());
        System.out.println("City : "+emp.getCity());


        

        ois.close();
    }
}
