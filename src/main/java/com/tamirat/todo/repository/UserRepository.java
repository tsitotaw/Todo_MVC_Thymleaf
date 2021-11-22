package com.tamirat.todo.repository;

import com.tamirat.todo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface UserRepository extends CrudRepository<User, Long> {
}
