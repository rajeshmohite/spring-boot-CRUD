package com.psl.school.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServices {

	@Autowired
	TeacherRepository teacherRepository;

	public List<Teacher> getAllTeachers() {
		return (List<Teacher>) teacherRepository.findAll();
	}

	public Teacher getTeacherById(int id) {
		return teacherRepository.findOne(id);
	}

	public void addTeacher(Teacher Teacher) {
		teacherRepository.save(Teacher);
	}

	public void deleteTeacher(int id) {
		teacherRepository.delete(id);
	}
}
