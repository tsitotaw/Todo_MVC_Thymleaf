package com.tamirat.todo.repository;

import com.tamirat.todo.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
