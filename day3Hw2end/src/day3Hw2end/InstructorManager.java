package day3Hw2end;

public class InstructorManager extends UserManager {
	
	public void getInformation (Instructor instructor) {
	System.out.println("Ogretmen Adi: "+ instructor.getFirstName() + " "+ instructor.getLastName());
	System.out.println("Ýletisim: "+ instructor.getEmail());
	System.out.println("Tecrube Yili: " + instructor.getExperience());
	}
	
	public void addUser(Instructor i ) {
		Instructor instructor = new Instructor(i.getFirstName(), i.getLastName(), i.getEmail(), i.getUsername(),
											   i.getPassword(),i.getExperience());
		i.instructors.add(instructor);
		System.out.println("Ogretmen olusturuldu.");
		
		
		
	}
	
	
	
	
	
}
