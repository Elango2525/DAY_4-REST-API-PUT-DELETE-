package com.example.StudentController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Entity.StudentDetails;
import com.example.Student.Service.StudentServices;
@RestController
public class Studentcontrollers {
	@Autowired
	StudentServices stuService;
	
	@PostMapping("/addDetails")
	
	public StudentDetails addInfo(@RequestBody StudentDetails st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("showDetails")
	public List<StudentDetails> fetchDetails(){
		return stuService.getDetails();
	}
	@PutMapping("/updateDetails")
	public StudentDetails updateInfo(@RequestBody StudentDetails st1) {
		return stuService.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{stu_id}")
    public  String deleteInfo(@PathVariable("stu_id")int stu_id)
     {
		stuService.deleteDetails(stu_id);
    	 return "Deleted the Details";
     }
}
