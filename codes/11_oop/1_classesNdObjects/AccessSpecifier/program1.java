class Course{

	int numCourses = 8;       // default <= access specifier
	private String favCourse = "CPP";     // private <= access specifier

	
	void display(){
	
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}
class Student{

	public static void main(String[] args){
	
		Course obj = new Course();
		obj.display();

		System.out.println(obj.numCourses);
		//System.out.println(obj.favCourse);   //  error: favCourse has private access in Course
	}
}

// Private access specifier can be accessible only in a class

// default access specifier can be accessible only in
//     -- same file
//     -- same folder

