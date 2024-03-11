package com.kota65535.repository;

import org.springframework.data.repository.ListCrudRepository;

public interface TaskRepository extends ListCrudRepository<TaskEntity, Integer> {
}
