package com.kota65535.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("task")
public class TaskEntity {

	@Id
	private Integer id;

	private String title;

	private AggregateReference<UserEntity, UUID> owner;
}
