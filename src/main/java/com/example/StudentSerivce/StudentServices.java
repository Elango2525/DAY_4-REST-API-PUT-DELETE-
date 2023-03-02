package com.example.StudentSerivce;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Entity.StudentDetails;
import com.example.Student.Repository.StudentRepo;
@Service
public class StudentServices {
	@Autowired //extends another class
    StudentRepo stRepo; //reference variable
	
	public StudentDetails saveDetails(StudentDetails e) {
		return stRepo.save(e);
	}
	public List<StudentDetails> getDetails()
	{
		return stRepo.findAll();
	}
	public StudentDetails updateDetails(StudentDetails e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int stu_id)
	{
		stRepo.deleteById(stu_id);
	}
}
