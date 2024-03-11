package com.kota65535.controller;

import com.kota65535.repository.TaskEntity;
import com.kota65535.repository.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TaskController {

	private final TaskRepository taskRepository;

	@GetMapping(value = "/tasks", produces = { "application/json" })
	public ResponseEntity<List<TaskEntity>> getTasks() {
		return ResponseEntity.ok(taskRepository.findAll());
	}

}
