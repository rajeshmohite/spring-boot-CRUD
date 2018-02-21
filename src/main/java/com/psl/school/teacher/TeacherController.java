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
	public List<Teacher> getAllTeachers(){
		return teacherServices.getAllTeachers();
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/teachers/{id}")
	public Teacher getTeacherById(@PathVariable("id") int id){
		return teacherServices.getTeacherById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/teachers")
	public void addTeacher(@RequestBody Teacher teacher){
		teacherServices.addTeacher(teacher);
	}

	@RequestMapping(method=RequestMethod.DELETE,path="/teachers/{id}")
	public void deleteTeacher(@PathVariable("id") int id){
		teacherServices.deleteTeacher(id);
	}
}
