package com.Xadmin.springBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Xadmin.springBootCrud.bean.Subject;
import com.Xadmin.springBootCrud.service.SubjectService;


@RestController
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/subject"))
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping(method=RequestMethod.POST,value=("/subject"))
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/subject/{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject) {
		subjectService.updateSubject(id,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/subject/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}
	
}
