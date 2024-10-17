package com.api.ivarbank.repository;

import com.api.ivarbank.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String username);
}
