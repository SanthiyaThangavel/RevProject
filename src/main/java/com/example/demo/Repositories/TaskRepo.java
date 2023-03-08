package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Task1;

public interface TaskRepo extends JpaRepository<Task1,Integer>{

}