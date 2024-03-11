package com.kota65535.repository;

import org.springframework.data.repository.ListCrudRepository;
import java.util.UUID;

public interface UserRepository extends ListCrudRepository<UserEntity, UUID> {

}
