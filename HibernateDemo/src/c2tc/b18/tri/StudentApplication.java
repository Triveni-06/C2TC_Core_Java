package c2tc.b18.tri;

import java.util.Scanner;

import c2tc.b18.tri.entities.Student;
import c2tc.b18.tri.service.StudentService;
import c2tc.b18.tri.service.StudentServiceImp;

public class StudentApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentServiceImp();
		
		//To store value
		System.out.println("Enter the details");
		Student student=new Student(sc.nextInt(),sc.next());
		service.addStudent(student);
	}
}
