package com.psl.school.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.psl.school.student.Student;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherServices teacherServices;
	
	@RequestMapping(method=RequestMethod.GET,path="/teachers")
	public List<Student> getAllStudents(){
		return teacherServices.getAllStudents();
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/teachers/{id}")
	public Student getStudentById(@PathVariable("id") int id){
		return teacherServices.getStudentById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/teachers")
	public void addStudent(@RequestBody Student student){
		teacherServices.addStudent(student);
	}

	@RequestMapping(method=RequestMethod.DELETE,path="/teachers/{id}")
	public void deleteStudent(@PathVariable("id") int id){
		teacherServices.deleteStudent(id);
	}
}
