package c2tc.b18.tri.repo;

import javax.persistence.EntityManager;

import c2tc.b18.tri.entities.Student;
import c2tc.b18.tri.repo.Configuration;

public class StudentRepoImp {
	EntityManager manager;

	public StudentRepoImp() {
    manager=Configuration.getEntityManager();
}

	public void addStudent(Student student) {
	}
}
