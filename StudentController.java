package myWebApp.CrudApplication.controller;

import myWebApp.CrudApplication.model.Student;
import myWebApp.CrudApplication.repo.StudentRepo;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentrepo;
	@PostMapping("/studentSave")
	public String insertStudent(Student student) {
	studentrepo.save(student);
	return "Your record is saved successfully !!"
	}
	
	@GetMapping("/getallstudent")
	public List<student>getstudent() {
	
	return (List<student>)studentrepo.findAll();
	}
	
	
	@GetMapping("/getById/{id}")
	public Optional<student>Studentgetbyid(@pathVeriable("id") int id) {
	return studentrepo.findById()
	
	}
	
	@PostMapping("/studentSave")
	public String insertStudent(Student student) {
	studentrepo.save(student);
	return "Your record is saved successfully !!"
	}
}
