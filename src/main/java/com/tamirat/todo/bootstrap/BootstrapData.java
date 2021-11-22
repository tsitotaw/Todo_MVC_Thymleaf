package com.tamirat.todo.bootstrap;

import com.tamirat.todo.domain.Todo;
import com.tamirat.todo.domain.User;
import com.tamirat.todo.repository.TodoRepository;
import com.tamirat.todo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner{

    private UserRepository userRepository;
    private TodoRepository todoRepository;

    public BootstrapData(UserRepository userRepository, TodoRepository todoRepository) {
        this.userRepository = userRepository;
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(1L, "Tamirat");
        User user2 = new User(2L, "Eric");

        Todo todo1 = new Todo(1L, "Check Inbox", false);
        Todo todo2 = new Todo(2L, "Exercise", false);
        Todo todo3 = new Todo(3L, "Pray", false);

        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);

        user1.getTodos().add(todo1);
        user1.getTodos().add(todo2);
        user2.getTodos().add(todo3);

        userRepository.save(user1);
        userRepository.save(user2);
    }
}
