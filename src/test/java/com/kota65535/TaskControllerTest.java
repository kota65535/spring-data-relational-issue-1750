package com.kota65535;

import static org.junit.jupiter.api.Assertions.*;

import com.kota65535.controller.TaskController;
import com.kota65535.repository.TaskEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import java.util.List;

@SpringBootTest
class TaskControllerTest {

	@Autowired
	TaskController sut;

	@Test
	void testGetTasks() {
		ResponseEntity<List<TaskEntity>> res = sut.getTasks();
		assertNotNull(res);
	}
}
