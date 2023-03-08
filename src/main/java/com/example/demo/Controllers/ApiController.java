package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Task1;
import com.example.demo.Repositories.TaskRepo;
import com.example.demo.Service.ApiService;


@RestController
@CrossOrigin
public class ApiController {

	@Autowired
	  TaskRepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getvalues")
	   public List<Task1> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/posts")
	  public Task1 create(@RequestBody Task1 t) {
		 return serviceRepository.save(t);
	 }
	 
	 @GetMapping("/getvalues/{id}")
	 public Optional<Task1> getbyid(@PathVariable int id){
		
		return service.gettaskdetail(id);
	 }
	 
	 @PutMapping("/puts")
	 public String update(@RequestBody Task1 t) {
		 return service.updateDetails(t);
	 }
	 
	 @DeleteMapping("/delt/{id}")
	 public String delete(@PathVariable int id) {
		 return service.deleteDetails(id);
	 }
	 
}