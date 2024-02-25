package serialization;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args)throws IOException{

        Employee employee = new Employee(101, "Ravi", "Delloite","Pune");

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(employee);

        oos.close();
    }
}
