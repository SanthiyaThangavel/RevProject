package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Task1;
import com.example.demo.Repositories.TaskRepo;



@Service
public class ApiService {

	@Autowired
	TaskRepo repository;
		public Optional<Task1> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(Task1 t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
}