public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Way 1");
        s1.setRollNo(11).setName("Tejas").setCity("Nashik");

        System.out.println(s1.toString());
        

        System.out.println("Way 2");
        Student s2 = new Student();
        s2
            .setRollNo(21)
            .setName("Ram")
            .setCity("Ayodhya");
        
        System.out.println(s2.toString());

        System.out.println("Way 3");
        Student s3 = Student.of()
            .setRollNo(31)
            .setName("Virat")
            .setCity("Mumbai");


        System.out.println(s3.toString());


    }
}
