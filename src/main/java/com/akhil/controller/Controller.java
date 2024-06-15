package com.akhil.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.entity.Courses;

@RestController
@RequestMapping("/hateos/Courses")
public class Controller {
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable("id") Integer id){
		System.out.println("Id at by Id Level: "+id);
		Courses course=new Courses(101,"Java","Sethu Akhil",6000.0);
		System.out.println("Before Link");
		Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).
				getAllCourses()).withRel("all");
		course.add(link);
		return new ResponseEntity<>(course,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public List<Courses> getAllCourses(){
		List<Courses> cList=new ArrayList<>();
		Courses course=new Courses();
		cList.add(new Courses(101,"Java","Sethu Akhil",6000.0));
		cList.add(new Courses(102,"Python"," Akhil",4000.0));
		cList.add(new Courses(103,"Java Script","Arjun",7000.0));
		cList.add(new Courses(104,"Hibernate","Avinash",2000.0));
		Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).
				getAllCourses()).withRel("all");
		course.add(link);
		return cList;
	}
	@GetMapping("/java")
	public ResponseEntity<?> getCourseJava(){
		Courses course=new Courses(102,"Java","Sethu Akhil",6000.0);
		System.out.println("Before Link");
		Link link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).
				getAllCourses()).withRel("all");
		course.add(link);
		return new ResponseEntity<>(course,HttpStatus.OK);
	}

}
