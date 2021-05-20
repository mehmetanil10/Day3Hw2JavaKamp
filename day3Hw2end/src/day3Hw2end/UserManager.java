package day3Hw2end;

import java.util.Scanner;

public class UserManager {
	Scanner scanner = new Scanner(System.in);

			//giris yapma
			
			public void signIn(User user) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Giriþ Yapýldý.");
			}
			// çýkýþ yapma
			
			public void signOut(User user) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Çýkýþ yapýldý.");
			}
			// kayýt ol
			public void addUser(User u) {
				User user = new User(u.getFirstName(), u.getLastName(), u.getEmail(), u.getUsername(), u.getPassword());
				u.users.add(user);
				System.out.println("Kullanýcý Oluþturuldu.");
			}
			
			// get info
			public void getInformation(User user) {
				System.out.println("Kullanicinin Gercek Adi: "+ user.getFirstName() + " "+ user.getLastName());
				System.out.println("Ýletisim: "+ user.getEmail());
				System.out.println("Kullanici Adi: "+ user.getUsername());
			}
			
			



}
