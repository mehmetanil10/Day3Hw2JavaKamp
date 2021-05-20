package day3Hw2end;

public class StudentManager extends UserManager {
	
	public void getInformation(Student student) {
		System.out.println("Ogretmenin Adi: "+ student.getFirstName()+ " " + student.getLastName());
		System.out.println("İletisim: "+ student.getEmail() ) ;
		System.out.println("Okul: " + student.getSchool());
		System.out.println("Bolum: "+ student.getDepartment());
		
	}
	
	public void addUser(Student s) {
		Student student = new Student(s.getFirstName(), s.getLastName(),s.getEmail(),s.getUsername(),
													s.getPassword(),s.getSchool(),s.getDepartment());
	
		s.students.add(student);
		System.out.println("Ogrenci olusturuldu.");
	
	
	}
	
	

}
