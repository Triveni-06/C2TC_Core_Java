package c2tc.b18.tri.service;

import c2tc.b18.tri.entities.Student;
import c2tc.b18.tri.repo.StudentRepo;
import c2tc.b18.tri.repo.StudentRepoImp;

public class StudentServiceImp implements StudentService {
	StudentRepoImp repo;
	public StudentServiceImp() {
		repo=new StudentRepoImp();
	}
	
	@Override
	public void addStudent(Student student) {
		repo.addStudent(student);
		
	}

}
