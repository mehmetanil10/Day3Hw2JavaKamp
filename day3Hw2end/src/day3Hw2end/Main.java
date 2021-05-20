package day3Hw2end;

public class Main {

	public static void main(String[] args) {
		//user
		User user = new User("Mehmet", "Anil","mehmet_anil405@hotmail.com","mehmetanil10","123123" );
		
		//instructor
		Instructor instructor = new Instructor("Engin","Demirog","engindemirog@gmail.com", "engindemirog","1234", 20);
		
		//student
		Student student = new Student("Mehmet", "Anil","mehmetanilov@gmail.com","mehmetanil","123123","Celal Bayar Üniversitesi","Bilgisayar Mühendisligi");
		
		//user manager
		UserManager userManager = new UserManager();
		
		userManager.addUser(user);
		userManager.signIn(user);
		userManager.signOut(user);
		userManager.getInformation(user);
		
		//instructor manager
		InstructorManager instructorManager = new InstructorManager();
				
		instructorManager.addUser(instructor);
		instructorManager.getInformation(instructor);
		
		//student manager
		StudentManager studentManager = new StudentManager();
				
		instructorManager.addUser(student);
		instructorManager.getInformation(student);
		

	}

}
